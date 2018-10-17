package com.epam.task3_1.model.abstract_toy;

/**
 * Created by maild on 12.10.2018.
 */
public abstract class KidsToys {
    private String title;
    private double price;
    private String warranty;
    private String material;
    private String color;

    public KidsToys() {
    }

    public KidsToys(String title, double price, String warranty, String material, String color) {
        this.title = title;
        this.price = price;
        this.warranty = warranty;
        this.material = material;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ", title='" + title + '\'' +
                ", price=" + price +
                ", warranty='" + warranty + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'';
    }
}
