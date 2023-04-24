package com.shuhai65.springframework.beans.factory.config;

public class BeanDefinition {
    /**
     * Class类型可以把Bean的实例化操作放到容器中进行
     */
    private Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBean() {
        return bean;
    }
}
