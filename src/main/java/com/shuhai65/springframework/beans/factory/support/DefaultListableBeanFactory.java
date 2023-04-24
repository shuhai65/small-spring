package com.shuhai65.springframework.beans.factory.support;

import com.shuhai65.springframework.beans.BeansException;
import com.shuhai65.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 接口定义了注册BeanDefinition的方法，而DefaultListableBeanFactory实现了这个接口，所以DefaultListableBeanFactory就可以注册BeanDefinition了
 * DefaultListableBeanFactory继承了AbstractAutowireCapableBeanFactory，所以DefaultListableBeanFactory也可以实例化Bean了
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
