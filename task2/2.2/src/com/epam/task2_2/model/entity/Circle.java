package com.epam.task2_2.model.entity;

/**
 * Created by maild on 12.10.2018.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return super.draw() +  ", radius=" + radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius ;
    }
}
