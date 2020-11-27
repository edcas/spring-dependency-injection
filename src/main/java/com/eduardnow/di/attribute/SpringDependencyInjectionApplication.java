package com.eduardnow.di.attribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        // Without Dependency Injection
        // Engine engine = new Engine("Kia", "2.0L 16V CVVT DUAL");
        // Car car = new Car("Kia", "Sportage 2021", engine);
        // System.out.println(car);

        /// With Dependency Injection SpringBoot
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        Car car = context.getBean(Car.class);
        System.out.println(car);

    }

}
