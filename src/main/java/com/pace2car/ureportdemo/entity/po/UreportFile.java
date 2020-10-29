package com.pace2car.ureportdemo.entity.po;

import lombok.Data;

import java.io.Serializable;
import java.sql.Blob;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.*;

/**
 * UreportFile实体
 * persistant object持久对象，与数据库表一一对应
 * <p>
 * +--------------------+
 * |  禁止修改此类文件  |
 * +--------------------+
 * <p>
 * 表说明：ureport报表文件表
 *
 * @author Pace2Car
 * @since 2020-10-28
 */
@Data
@TableName("ureport_file")
public class UreportFile implements Serializable {
    /**
     * 主键
     */
    private Integer pkId;
    /**
     * 报表名称
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String ureportName;
    /**
     * 报表内容
     */
    private byte[] ureportContent;
    /**
     * 创建用户ID
     */
    private String createUser;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 修改用户ID
     */
    private String updateUser;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 逻辑删除标识(0/false：未删除(默认)；1/true：已删除)
     */
    @TableLogic
    private Boolean isDeleted;
}