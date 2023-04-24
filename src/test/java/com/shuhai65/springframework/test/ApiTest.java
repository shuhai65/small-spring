package com.shuhai65.springframework.test;

import com.shuhai65.springframework.beans.factory.config.BeanDefinition;
import com.shuhai65.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.shuhai65.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_BeanFactory() {
//        // 1.初始化 BeanFactory
//        BeanFactory beanFactory = new BeanFactory();
//
//        // 2.注入bean
//        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
//        beanFactory.registerBeanDefinition("userService", beanDefinition);
//
//        // 3.获取bean
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfo();
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.获取bean 测试单例
        UserService userService1 = (UserService) beanFactory.getBean("userService");
        System.out.println(userService == userService1);
        userService1.queryUserInfo();
    }

}
