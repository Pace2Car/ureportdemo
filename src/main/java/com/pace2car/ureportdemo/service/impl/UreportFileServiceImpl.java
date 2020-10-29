package com.pace2car.ureportdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.pace2car.ureportdemo.entity.dto.UreportFileDto;
import com.pace2car.ureportdemo.entity.po.UreportFile;
import com.pace2car.ureportdemo.service.UreportFileService;
import com.pace2car.ureportdemo.mapper.UreportFileMapper;


/**
 * UreportFile对象-业务逻辑接口实现层
 *
 * +---------------------------------------------------------------+
 * |                方法严格按照其接口类顺序排列                   |
 * +---------------------------------------------------------------+
 *
 * @author Pace2Car
 * @since 2020-10-28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UreportFileServiceImpl extends ServiceImpl<UreportFileMapper, UreportFile> implements UreportFileService {

    @Autowired
    private UreportFileMapper ureportFileMapper;

    @Override
    public PageInfo<?> selectPage(UreportFileDto ureportFileDto) {
        PageHelper.startPage(ureportFileDto.getCurrentPage(), ureportFileDto.getPageSize());
        List<UreportFile> list = this.list();
        return new PageInfo<>(list);
    }
}