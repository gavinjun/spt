package com.gavin.spt.order.dto.rsp;

import lombok.Data;

import java.util.Date;

@Data
public class OrderItem {
    private String orderNo;
    private Integer userId;
    private Date payTime;
}
