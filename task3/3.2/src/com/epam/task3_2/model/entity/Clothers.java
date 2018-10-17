package com.epam.task3_2.model.entity;

/**
 * Created by maild on 17.10.2018.
 */
public class Clothers extends Good {
    public Clothers(String title, double price) {
        super(title, price);
    }

    @Override
    public String toString() {
        return Clothers.class.getSimpleName() + super.toString();
    }
}
