package com.pace2car.ureportdemo.entity.dto;

import com.pace2car.ureportdemo.dto.PageBound;
import lombok.Data;

import java.io.Serializable;
import java.sql.Blob;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * UreportFile实体的数据传输对象类，对外进行数据传送对象(自动生成）
 * <p>
 * 说明：Business Object 数据传输对象
 * <p>
 * +----------------------------------------------------------------------------------+
 * |    可链式调用Setter方法，可新增业务属性（非DB字段）                              |
 * |    重要：DTO中的属性原则上都需要进行参数校验                                     |
 * +----------------------------------------------------------------------------------+
 *
 * @author Pace2Car
 * @since 2020-10-28
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class UreportFileDto extends PageBound implements Serializable {
    /**
     * 报表名称
     */
    private String ureportName;
    /**
     * 报表内容
     */
    private Blob ureportContent;
    /**
     * 创建用户ID
     */
    private String createUser;
    /**
     * 修改用户ID
     */
    private String updateUser;
}