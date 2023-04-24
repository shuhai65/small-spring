package com.shuhai65.springframework.beans.factory.support;

import com.shuhai65.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义一个获取单例对象的接口
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    // 将单例对象添加到单例对象的缓存中
    // 此方法可以被子类调用 包括AbstractBeanFactory和DefaultListableBeanFactory
    public void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
