package com.eduardnow.di.loadProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure {

    @Value("${square.side}")
    private double side;

    @Override
    public Double calculateArea() {
        return side * side;
    }
}
