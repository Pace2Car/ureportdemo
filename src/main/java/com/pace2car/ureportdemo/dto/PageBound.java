package com.pace2car.ureportdemo.dto;

import com.pace2car.ureportdemo.interfaces.valid.PageGroup;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 基础类
 * 分页组件
 * @author Pace2Car
 * @date 2020-10-28
 */
@Data
public class PageBound implements Serializable {
    /**
     * 当前页号
     */
    @NotNull(message = "页号必须大于1", groups = {PageGroup.class})
    @Min(value = 1, message = "页号必须大于1", groups = {PageGroup.class})
    protected Integer currentPage;
    /**
     * 页尺寸
     */
    @NotNull(message = "页尺寸必须大于1且小于500", groups = {PageGroup.class})
    @Min(value = 1, message = "页尺寸必须大于1", groups = {PageGroup.class})
    @Max(value = 500, message = "页尺寸必须小于500", groups = {PageGroup.class})
    protected Integer pageSize;
}
