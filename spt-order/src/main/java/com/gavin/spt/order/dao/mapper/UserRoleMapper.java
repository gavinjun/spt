package com.gavin.spt.order.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gavin.spt.order.dao.entity.UserRole;

public interface UserRoleMapper extends BaseMapper<UserRole> {
    int insertSelective(UserRole record);
}