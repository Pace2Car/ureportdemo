package com.pace2car.ureportdemo.provider;

import com.bstek.ureport.provider.report.ReportFile;
import com.bstek.ureport.provider.report.ReportProvider;
import com.pace2car.ureportdemo.entity.po.UreportFile;
import com.pace2car.ureportdemo.service.UreportFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 使用mysql存储报表文件实现类
 *
 * @author Pace2Car
 * @since 2020/10/28 16:59
 */
@Component
public class MysqlProvider implements ReportProvider {

    /**
     * 名称
     */
    private static final String NAME = "mysql-provider";

    /**
     * 特定前缀，ureport底层会调用 getPrefix 方法来获取报表操作的Provier类
     */
    private static final String PREFIX = "mysql:";

    /**
     * 是否禁用
     */
    private boolean disabled;

    @Autowired
    private UreportFileService ureportFileService;

    @Override
    public InputStream loadReport(String file) {
        file = getCorrectName(file);
        UreportFile ureportFile = ureportFileService.getById(file);
        byte[] content = ureportFile.getUreportContent();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(content);
        return inputStream;
    }

    @Override
    public void deleteReport(String file) {
        ureportFileService.removeById(file);
    }

    @Override
    public List<ReportFile> getReportFiles() {
        List<UreportFile> list = ureportFileService.list();
        List<ReportFile> reportList = new ArrayList<>();
        for (UreportFile ureportFile : list) {
            reportList.add(new ReportFile(ureportFile.getUreportName(),
                    Date.from(ureportFile.getUpdateTime().atZone(ZoneId.systemDefault()).toInstant())));
        }
        return reportList;
    }

    @Override
    public void saveReport(String file, String content) {
        file = getCorrectName(file);
        UreportFile ureportFile = ureportFileService.getById(file);
        String ureportContent = content;
        if (ureportFile == null) {
            ureportFile = new UreportFile();
            ureportFile.setUreportName(file);
            ureportFile.setUreportContent(ureportContent.getBytes());
            ureportFileService.saveOrUpdate(ureportFile);
        } else {
            ureportFile.setUreportContent(ureportContent.getBytes());
            ureportFile.setUpdateTime(LocalDateTime.now());
            ureportFileService.saveOrUpdate(ureportFile);
        }
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean disabled() {
        return disabled;
    }

    @Override
    public String getPrefix() {
        return PREFIX;
    }

    /**
     * 获取没有前缀的文件名
     *
     * @param name
     * @return
     */
    private String getCorrectName(String name) {
        if (name.startsWith(PREFIX)) {
            name = name.substring(PREFIX.length());
        }
        return name;
    }
}
