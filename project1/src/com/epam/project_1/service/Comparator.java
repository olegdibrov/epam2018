package com.epam.project_1.service;

import com.epam.project_1.model.entity.Stone;

/**
 * Created by maild on 24.10.2018.
 */
public class Comparator implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return Double.compare(((Stone) o1).getPrice(), ((Stone) o2).getPrice());
    }
}
