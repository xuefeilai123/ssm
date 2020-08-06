package com.ssm.study;

import com.alibaba.fastjson.JSON;
import com.ssm.study.domain.User;
import com.ssm.study.service.IUserService;
import com.ssm.study.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Test {
    private IUserService userService;
    private ClassPathXmlApplicationContext context;
    Logger logger = Logger.getLogger(Test.class);
    @Before
    public void before() {
        System.out.println("before test");
        context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        context.start();
    }
    @org.junit.Test
    public void test() {
        if (context != null) {
            userService = (UserServiceImpl) context.getBean("userService");
            User user = userService.getUserById(1);
            System.out.println(JSON.toJSONString(user));
        }
    }
    @After
    public void after() {
        System.out.println("after test");
        context.close();
    }
}
