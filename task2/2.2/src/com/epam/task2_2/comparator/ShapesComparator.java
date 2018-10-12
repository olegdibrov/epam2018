package com.epam.task2_2.comparator;

import com.epam.task2_2.model.entity.Shape;

import java.util.Comparator;

/**
 * Created by maild on 12.10.2018.
 */
public class ShapesComparator  implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Shape)o1).getShapeColor();
        String color2 = ((Shape)o2).getShapeColor();
        return color1.compareTo(color2);
    }

}
