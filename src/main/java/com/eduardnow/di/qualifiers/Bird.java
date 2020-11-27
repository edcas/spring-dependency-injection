package com.eduardnow.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("birdie")
public class Bird extends Animal implements Flyable {

    private static final Logger log = LoggerFactory.getLogger(Bird.class);

    public Bird(@Value("1") Integer age, @Value("Crazy") String name) {
        super(age, name);
    }

    @Override
    public void fly() {
        log.info("Bird Flying");
    }
}
