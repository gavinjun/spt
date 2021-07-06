package com.gavin.spt.order.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gavin.spt.order.dao.entity.OrderExt;

public interface OrderExtMapper extends BaseMapper<OrderExt> {
    int insertSelective(OrderExt record);
}