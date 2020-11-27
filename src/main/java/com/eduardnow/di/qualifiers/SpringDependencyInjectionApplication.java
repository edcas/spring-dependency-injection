package com.eduardnow.di.qualifiers;

import com.eduardnow.di.constructors.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        Animal animal = context.getBean("birdie", Animal.class);
        System.out.println(animal);

        Nest nest = context.getBean(Nest.class);
        System.out.println(nest);
    }

}
