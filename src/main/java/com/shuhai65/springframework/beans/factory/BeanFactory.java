package com.shuhai65.springframework.beans.factory;

import com.shuhai65.springframework.beans.BeansException;

/**
 * BeanFactory中的getBean方法，用于从IOC容器中获取一个Bean实例
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;
}
