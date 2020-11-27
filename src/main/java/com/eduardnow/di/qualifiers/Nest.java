package com.eduardnow.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nest {

    private static final Logger log = LoggerFactory.getLogger(Nest.class);

    private Animal animal;

    @Autowired
    public Nest(@Qualifier("birdie") Animal animal) {
        this.animal = animal;
    }

    public static Logger getLog() {
        return log;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Nest{" +
                "animal=" + animal +
                '}';
    }
}
