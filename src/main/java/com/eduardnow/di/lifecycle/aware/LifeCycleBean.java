package com.eduardnow.di.lifecycle.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    @Override
    public void setBeanName(String name) {
        log.info("BeanNameAware {}", name);
    }

    @PostConstruct
    public void init() {
        log.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        log.info("DisposableBean - destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet");
    }
}
