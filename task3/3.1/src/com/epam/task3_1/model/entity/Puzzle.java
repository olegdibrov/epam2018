package com.epam.task3_1.model.entity;

import com.epam.task3_1.model.abstract_toy.KidsToys;

/**
 * Created by maild on 13.10.2018.
 */
public class Puzzle extends KidsToys {
    private int numberOfElements;

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Puzzle(String title, double price, String warranty, String material, String color, int numberOfElements) {
        super(title, price, warranty, material, color);
        this.numberOfElements = numberOfElements;
    }

    @Override
    public String toString() {
        return "Puzzle{" +
                "numberOfElements=" + numberOfElements +  super.toString() +
                '}';
    }
}
