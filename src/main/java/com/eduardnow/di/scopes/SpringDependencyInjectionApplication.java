package com.eduardnow.di.scopes;

import com.eduardnow.di.setters.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sun.java2d.cmm.Profile;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringDependencyInjectionApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        // Singleton
        Singleton singleton = context.getBean(Singleton.class);
        Singleton singleton2 = context.getBean(Singleton.class);
        log.info("Are beans equals => {}", singleton.equals(singleton2));
        log.info("Are beans == => {}", singleton == singleton2);

        // Prototype
        Prototype prototype = context.getBean(Prototype.class);
        Prototype prototype2 = context.getBean(Prototype.class);
        log.info("Are beans equals => {}", prototype.equals(prototype2));
        log.info("Are beans == => {}", prototype == prototype2);


    }

}
