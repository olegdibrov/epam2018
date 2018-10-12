package com.epam.task2_2.model.entity;

import com.epam.task2_2.model.Shape;

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
    public String toString() {
        return "Circle: " +
                "radius=" + radius + ", shape of color=" + super.getShapeColor() + ", area =" + calcArea();
    }
}
