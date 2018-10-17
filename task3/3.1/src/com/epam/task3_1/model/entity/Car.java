package com.epam.task3_1.model.entity;

import com.epam.task3_1.model.abstract_toy.KidsToys;

/**
 * Created by maild on 12.10.2018.
 */
public class Car extends KidsToys {
    private int speed;
    private String scale;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public Car(String title, double price, String warranty, String material, String color, int speed, String scale) {
        super(title, price, warranty, material, color);
        this.speed = speed;
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", scale='" + scale + '\'' + super.toString() +
                '}';
    }
}
