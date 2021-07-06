package com.gavin.spt.order;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gavin.spt.order.dao.entity.User;
import com.gavin.spt.order.dao.mapper.UserMapper;
import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@SpringBootTest
class OrderApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
    }
        
    @Test
    void test() {
        System.out.println(1);
    }
    
    @Test
    void insertUser() {
        User user = new User();
        user.setUserName("gavin");
        user.setPassword("123456");
        user.setEnable(1);
        user.setLocked(0);
        userMapper.insert(user);
    }
    @Test
    void testSelect() {
        User user = new User();
//        user.setId(1);
        LambdaQueryWrapper<User> lwq = new LambdaQueryWrapper<>();
        lwq.eq(Objects.nonNull(user.getId()), User::getId, user.getId());
        lwq.eq(User::getUserName, "gavin");
//        User selectOne = userMapper.selectOne(lwq);
        IPage<User> rowBounds = new Page(2, 2);
        IPage<User> pageRs = userMapper.selectPage(rowBounds, lwq);
        System.out.println(pageRs);
        System.out.println(userMapper.selectCount(lwq));;
        LambdaQueryWrapper<User> lwq2 = lwq.clone();
        lwq2.eq(User::getEnable, 1);
        lwq2.select(User::getUserName, User::getPassword);
        lwq2.select(User.class, tableFieldInfo -> true);
        List<User> users = userMapper.mSelectPage(lwq2, 2, 2);
        System.out.println(users);
    }

    @Test
    void test1() {
        B b = new B();
        b.setName("hh");
        b.setA(1);
        b.setB(2);

        B b1 = new B();
        b1.setName(b.getName());
        b1.setA(3);
        b1.setB(4);

        System.out.println(b.equals(b1));
    }

}
