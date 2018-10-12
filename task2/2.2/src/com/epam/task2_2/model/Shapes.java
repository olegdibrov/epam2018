package com.epam.task2_2.model;

import com.epam.task2_2.model.entity.Circle;
import com.epam.task2_2.model.entity.Rectangle;
import com.epam.task2_2.model.entity.Shape;
import com.epam.task2_2.model.entity.Triangle;

/**
 * Created by maild on 12.10.2018.
 */
public class Shapes {
    private Shape[] shapes;

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double getAllArea() {
        int sumArea = 0;
        for (Shape shape: shapes ) {
            sumArea += shape.calcArea();
        }
        return sumArea;
    }

    public double getAreaByShape(int typeOfShape) {
        int sumArea = 0;
        switch (typeOfShape) {
            case 0:
                for (Shape shape: shapes ) {
                    if (shape instanceof Circle){
                        sumArea += shape.calcArea();
                    }
                }
                break;
            case 1:
                for (Shape shape: shapes ) {
                    if (shape instanceof Rectangle){
                        sumArea += shape.calcArea();
                    }
                }
                break;
            case 2:
                for (Shape shape: shapes ) {
                    if (shape instanceof Triangle){
                        sumArea += shape.calcArea();
                    }
                }
                break;
        }
        return sumArea;
    }
}
