package com.epam.task3_2.model.entity;

/**
 * Created by maild on 17.10.2018.
 */
public class Accessories extends Good {
    public Accessories(String title, double price) {
        super(title, price);
    }

    @Override
    public String toString() {
        return Accessories.class.getSimpleName() + super.toString();
    }
}
