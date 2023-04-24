package com.shuhai65.springframework.beans.factory.config;

/**
 * 单例注册接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}