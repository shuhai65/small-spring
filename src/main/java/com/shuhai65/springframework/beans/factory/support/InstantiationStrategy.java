package com.shuhai65.springframework.beans.factory.support;

import com.shuhai65.springframework.beans.BeansException;
import com.shuhai65.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean 实例化策略
 */
public interface InstantiationStrategy {
    //Constructor是java.lang.reflect一个类，它包含了一个类的构造函数的信息，可以用来创建类的对象。
    //args是构造函数的参数
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
