package com.gavin.spt.order.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gavin.spt.order.dao.entity.Role;

public interface RoleMapper extends BaseMapper<Role> {
    int insertSelective(Role record);
}