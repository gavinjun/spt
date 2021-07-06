package com.gavin.spt.order.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author gavin
 * @since 2021-07-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_order_ext")
public class OrderExt implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("address")
    private String address;

    @TableField("order_id")
    private Integer orderId;


}
