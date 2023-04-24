package com.shuhai65.springframework.beans.factory.support;

import com.shuhai65.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    /**
     * 注册BeanDefinition
     * @param beanName bean名称
     * @param beanDefinition bean定义
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
