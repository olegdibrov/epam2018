package com.epam.project_1.model.entity;

import com.epam.project_1.model.enums.*;
import com.epam.project_1.model.enums.Color;

import java.awt.*;

/**
 * Created by maild on 22.10.2018.
 */
public class Stone {
    private String chemicalFormula;
    private String origin;
    private int transparency;
    private Color color;
    private int hardness;
    private double price;

    public Stone(String chemicalFormula, String origin, int transparency, Color color, int hardness, double price) {
        this.chemicalFormula = chemicalFormula;
        this.origin = origin;
        this.transparency = transparency;
        this.color = color;
        this.hardness = hardness;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public String getOrigin() {
        return origin;
    }

    public int getTransparency() {
        return transparency;
    }

    public Color getColor() {
        return color;
    }

    public int getHardness() {
        return hardness;
    }


    @Override
    public String toString() {
        return ", chemicalFormula='" + chemicalFormula + '\'' +
                ", origin='" + origin + '\'' +
                ", transparency=" + transparency +
                ", color=" + color +
                ", hardness=" + hardness +
                ", price=" + price +
                '}';
    }
}
