package com.gavin.spt.order.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gavin.spt.order.dao.entity.Menu;

public interface MenuMapper extends BaseMapper<Menu> {

    int insertSelective(Menu record);



}