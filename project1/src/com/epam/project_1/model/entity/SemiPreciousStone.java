package com.epam.project_1.model.entity;

import com.epam.project_1.model.enums.Color;
import com.epam.project_1.model.enums.ListOfSemiPreciousStone;


/**
 * Created by maild on 22.10.2018.
 */
public class SemiPreciousStone extends Stone {
    private ListOfSemiPreciousStone name;
    private double weight;

    public SemiPreciousStone(String chemicalFormula, String origin, int transparency, Color color, int hardness,
                             double price, ListOfSemiPreciousStone name, double weight) {
        super(chemicalFormula, origin, transparency, color, hardness, price);
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * weight;
    }

    public ListOfSemiPreciousStone getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "SemiPreciousStone{" +
                "name=" + name +
                ", weight=" + weight + super.toString() +
                '}';
    }
}
