package com.eduardnow.di.explicitBean;

import com.eduardnow.di.qualifiers.Animal;
import com.eduardnow.di.qualifiers.Nest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringDependencyInjectionApplication.class);

    @Bean
    public String getApplicationName() {
        return "eduardnow.tech";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        String appName = context.getBean(String.class);
        log.info("Application name {}", appName);
    }

}
