package com.epam.project_1.model.entity;

import com.epam.project_1.model.enums.Color;
import com.epam.project_1.model.enums.ListOfGemStone;


/**
 * Created by maild on 22.10.2018.
 */
public class GemStone extends Stone {
    private ListOfGemStone name;
    private double carat;

    public GemStone(String chemicalFormula, String origin, int transparency, Color color, int hardness, double price,
                    ListOfGemStone name, double carat) {
        super(chemicalFormula, origin, transparency, color, hardness, price);
        this.name = name;
        this.carat = carat;
    }

    public ListOfGemStone getName() {
        return name;
    }

    public double getCarat() {
        return carat;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * carat;
    }

    @Override
    public String toString() {
        return "GemStone{" +
                "name=" + name +
                ", carat=" + carat + super.toString() +
                '}';
    }
}
