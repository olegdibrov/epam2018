package com.epam.task3_1.model.entity;

import com.epam.task3_1.model.abstract_toy.KidsToys;

/**
 * Created by maild on 13.10.2018.
 */
public class RadioControlled extends KidsToys{
    private String type;
    private int speed;
    private String power;


    public RadioControlled(String title, double price, String warranty, String material, String color, String type, int speed, String power) {
        super(title, price, warranty, material, color);
        this.type = type;
        this.speed = speed;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "RadioControlled{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                ", power='" + power + '\'' + super.toString() +
                '}';
    }
}
