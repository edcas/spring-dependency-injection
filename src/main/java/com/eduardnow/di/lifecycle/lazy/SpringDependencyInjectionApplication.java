package com.eduardnow.di.lifecycle.lazy;

import com.eduardnow.di.lifecycle.aware.LifeCycleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringDependencyInjectionApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
    }

}
