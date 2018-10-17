package com.epam.task3_1.model.entity;

import com.epam.task3_1.model.abstract_toy.KidsToys;

/**
 * Created by maild on 12.10.2018.
 */
public class Lego extends KidsToys {
    private int numOfLego;

    public int getNumOfLego() {
        return numOfLego;
    }

    public void setNumOfLego(int numOfLego) {
        this.numOfLego = numOfLego;
    }

    public Lego(String title, double price, String warranty, String material, String color, int numOfLego) {
        super(title, price, warranty, material, color);
        this.numOfLego = numOfLego;
    }

    @Override
    public String toString() {
        return "Lego{" +
                "numOfLego=" + numOfLego + super.toString() +
                '}';
    }
}
