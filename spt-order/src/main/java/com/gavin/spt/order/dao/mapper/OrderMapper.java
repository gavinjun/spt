package com.gavin.spt.order.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gavin.spt.order.dao.entity.Order;

public interface OrderMapper extends BaseMapper<Order> {
    int insertSelective(Order record);
}