package com.pace2car.ureportdemo.service;

import com.github.pagehelper.PageInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.pace2car.ureportdemo.entity.po.UreportFile;
import com.pace2car.ureportdemo.entity.dto.UreportFileDto;

/**
 * UreportFile对象-业务逻辑接口层
 *
 * +--------------------------------------------------------------------------------------------------+
 * |                若新增方法请按照CDUR(增删改查)顺序排列，                                          |
 * |                每个方法必须添加javaDoc(方法说明，参数说明，响应说明）。                          |
 * +--------------------------------------------------------------------------------------------------+
 *
 * @author Pace2Car
 * @since 2020-10-28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public interface UreportFileService extends IService<UreportFile> {

    /**
    * 分页查询
    * @param ureportFileDto 查询对象
    * @return 分页查询结果
    */
    PageInfo<?> selectPage(UreportFileDto ureportFileDto);
}