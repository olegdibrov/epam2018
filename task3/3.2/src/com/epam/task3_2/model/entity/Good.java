package com.epam.task3_2.model.entity;

/**
 * Created by maild on 17.10.2018.
 */
public class Good {
    private String title;
    private double price;

    public Good(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "title='" + title  +
                ", price=" + price;
    }
}
