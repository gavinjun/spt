package com.gavin.spt.order.dto.rsp;

import lombok.Data;

import java.util.List;

@Data
public class OrderItems {
    private List<OrderItem> orderItemList;
}
