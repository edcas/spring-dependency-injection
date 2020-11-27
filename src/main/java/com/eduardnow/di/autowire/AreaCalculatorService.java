package com.eduardnow.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaCalculatorService {

    @Autowired
    private List<Figure> figures;

    public double calcAreas() {
        return figures.stream().mapToDouble(Figure::calculateArea).sum();
    }

}
