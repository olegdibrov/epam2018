package com.epam.task3_1.comparator;

import com.epam.task3_1.model.abstract_toy.KidsToys;

import java.util.Comparator;

/**
 * Created by maild on 14.10.2018.
 */
public class ComparatorByPrice implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return Double.compare(((KidsToys) o1).getPrice(), ((KidsToys) o2).getPrice());
    }
}
