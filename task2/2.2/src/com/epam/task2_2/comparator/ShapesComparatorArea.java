package com.epam.task2_2.comparator;

import com.epam.task2_2.model.Shape;

import java.util.Comparator;

/**
 * Created by maild on 12.10.2018.
 */
public class ShapesComparatorArea implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape)o1;
        Shape shape2 = (Shape)o2;
        if (shape1.calcArea() > shape2.calcArea()) return 1;
        if (shape1.calcArea() < shape2.calcArea()) return -1;
        return 0;
    }
}
