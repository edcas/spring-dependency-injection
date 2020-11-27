package com.eduardnow.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    public Dog(@Value("3") Integer age, @Value("Rockie") String name) {
        super(age, name);
    }
}
