package com.epam.task2_2.model.entity;

/**
 * Created by maild on 12.10.2018.
 */
public class Triangle extends Shape {
    private double side1;
    private double side2;

    public Triangle(String shapeColor, double side1, double side2) {
        super(shapeColor);
        this.side1 = side1;
        this.side2 = side2;
    }

    public Triangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calcArea() {
        return 0.5 * side1 * side2;
    }

    @Override
    public String draw() {
        return super.draw() +  ", side1=" + side1 +
                ", side2=" + side2  + ", " ;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", side1=" + side1 +
                ", side2=" + side2  + ", " ;
    }
}
