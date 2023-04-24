package com.shuhai65.springframework.beans.factory.support;

import com.shuhai65.springframework.beans.BeansException;
import com.shuhai65.springframework.beans.factory.config.BeanDefinition;


public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    //处理完实例化后，调用addSingleton方法，将bean放入单例池中
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBean().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("实例化bean失败", e);
        }
        //DefaultSingletonBeanRegistry中的方法，将bean放入单例池中
        addSingleton(beanName, bean);
        return bean;
    }
}
