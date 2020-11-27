package com.eduardnow.aop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        TargetObject targetObject = context.getBean(TargetObject.class);
        targetObject.hello("John");

    }

}
