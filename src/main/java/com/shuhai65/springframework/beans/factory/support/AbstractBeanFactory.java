package com.shuhai65.springframework.beans.factory.support;

import com.shuhai65.springframework.beans.BeansException;
import com.shuhai65.springframework.beans.factory.BeanFactory;
import com.shuhai65.springframework.beans.factory.config.BeanDefinition;

/**
 * 继承了DefaultSingletonBeanRegistry，也就具备了使用Map来存储单例Bean（单例注册类方法）的能力
 * BeanFactory接口的实现类，主要是对单例Bean对象的获取以及在获取不到时（拿到BeanDefinition即bean的定义做相应Bean实例化操作）的创建
 * AbstractBeanFactory没有实现getBeanDefinition和createBean，而是由继承了AbstractBeanFactory的子类来实现
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}