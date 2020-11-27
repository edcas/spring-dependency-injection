package com.eduardnow.di.lifecycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class BeanDependency {

    private static final Logger log = LoggerFactory.getLogger(BeanDependency.class);

    @PostConstruct
    public void init() {
        log.info("BeanDependency Lazy");
    }

}
