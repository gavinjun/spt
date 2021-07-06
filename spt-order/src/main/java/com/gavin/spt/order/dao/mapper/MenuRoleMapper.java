package com.gavin.spt.order.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gavin.spt.order.dao.entity.MenuRole;

public interface MenuRoleMapper extends BaseMapper<MenuRole> {
    int insertSelective(MenuRole record);
}