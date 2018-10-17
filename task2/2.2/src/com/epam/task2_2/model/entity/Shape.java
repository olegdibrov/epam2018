package com.epam.task2_2.model.entity;

import com.epam.task2_2.model.entity.Drawable;

/**
 * Created by maild on 12.10.2018.
 */
public abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape() {
    }

    @Override
    public String draw() {
        return this.getClass().getSimpleName() + ", shapeColor=" + shapeColor + ", area="  + calcArea();
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", shapeColor=" + shapeColor + ", area="  + calcArea();
    }
}
