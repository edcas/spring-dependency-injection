package com.eduardnow.di.lifecycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy(false) // Eager
public class BeanB {

    private static final Logger log = LoggerFactory.getLogger(BeanB.class);

    @Autowired
    private BeanDependency beanDependency;

    public BeanB() {
    }

    @PostConstruct
    public void init() {
        log.info("Bean B");
    }

}
