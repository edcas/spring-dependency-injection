package com.eduardnow.di.primary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        Animal animal = context.getBean(Animal.class);
        System.out.println(animal);

        Nest nest = context.getBean(Nest.class);
        System.out.println(nest);
    }

}
