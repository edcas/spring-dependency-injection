package com.eduardnow.di.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Plane implements Flyable {

    private static final Logger log = LoggerFactory.getLogger(Plane.class);

    @Override
    public void fly() {
        log.info("Plane flying");
    }
}
