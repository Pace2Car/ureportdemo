package com.pace2car.ureportdemo.entity.bo;

import com.pace2car.ureportdemo.entity.po.UreportFile;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.experimental.Accessors;

/**
 * UreportFile实体的业务对象类，对外进行业务传送对象(自动生成）
 *
 * 说明：Business Object业务对象
 *
 * +----------------------------------------------------------------------------------+
 * |    可链式调用Setter方法，可新增属性（非DB字段）                              |
 * |    请勿在BO内保留不会进行业务传送的属性                                          |
 * |    若PO对象内存在复合属性，请勿在BO内保留复合属性，建议在BO中拆分为多个属性      |
 * +----------------------------------------------------------------------------------+
 *
 * @author Pace2Car
 * @since 2020-10-28
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UreportFileBo extends UreportFile implements Serializable {
}