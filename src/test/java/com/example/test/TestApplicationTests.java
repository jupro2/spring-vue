package com.example.test;

import com.example.test.spring.User;
import com.example.test.spring.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void findAll() {
        List<User> list=userMapper.findAll();//执行sql语句
        System.out.println(list);
    }
}
