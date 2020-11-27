package com.eduardnow.di.lifecycle.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    private static final Logger log = LoggerFactory.getLogger(SpringDependencyInjectionApplication.class);


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof LifeCycleBean) {
            log.info("postProcessBeforeInitialization {}", beanName);
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeCycleBean) {
            log.info("postProcessAfterInitialization {}", beanName);
        }

        return bean;
    }
}
