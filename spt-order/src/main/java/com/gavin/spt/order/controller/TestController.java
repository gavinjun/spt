package com.gavin.spt.order.controller;

import com.gavin.spt.common.exception.Asserts;
import com.gavin.spt.order.dao.entity.User;
import com.gavin.spt.order.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class TestController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "/test")
    public String test() throws Exception {
//        Asserts.fail("test error");
        throw new Exception("xx");
    }

    @RequestMapping(value = "/test1")
    public String test1() throws Exception {
//        Asserts.fail("test error");
        throw new RuntimeException("xx");
    }

    @RequestMapping(value = "/test2")
    @Transactional
    public void test2(Integer id) {
        User user = new User();
        user.setUserName("gavin");
        user.setPassword("1234567");
        user.setEnable(1);
        user.setLocked(0);
        userMapper.insert(user);
        user.setUserName("gavin1");
        userMapper.insert(user);
        if (Objects.isNull(id)) {
            throw new RuntimeException();
        }
    }
}
