package com.gavin.spt.order;

import com.gavin.spt.order.dao.entity.User;
import com.gavin.spt.order.dao.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class MyBatisTests {
    @Autowired
    UserMapper userMapper;
    @Test
    @Transactional
    void test() {
        User user = new User();
        user.setUserName("gavin");
        user.setPassword("1234567");
        user.setEnable(1);
        user.setLocked(0);
        userMapper.insert(user);
        user.setUserName("gavin1");
        userMapper.insert(user);
//        throw new RuntimeException();
    }

}
