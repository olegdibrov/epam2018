package com.epam.task3_2.model.entity;

/**
 * Created by maild on 17.10.2018.
 */
public class Shoes extends Good {
    public Shoes(String title, double price) {
        super(title, price);
    }

    @Override
    public String toString() {
        return Shoes.class.getSimpleName() + super.toString();
    }
}
