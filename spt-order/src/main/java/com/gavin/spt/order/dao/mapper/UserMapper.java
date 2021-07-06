package com.gavin.spt.order.dao.mapper;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gavin.spt.order.dao.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User record);


    @Select("select ${ew.sqlSelect} from t_user ${ew.customSqlSegment} limit #{offset}, #{size}")
    List<User> mSelectPage(@Param(Constants.WRAPPER) Wrapper wrapper, @Param("offset") long start,@Param("size") long pageSize);
}