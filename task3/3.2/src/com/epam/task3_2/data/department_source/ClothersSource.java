package com.epam.task3_2.data.department_source;

import com.epam.task3_2.model.entity.Clothers;
import com.epam.task3_2.model.entity.Good;

/**
 * Created by maild on 17.10.2018.
 */
public class ClothersSource {

    public Good[] getClothers(int amount, Good[] goods) {
        goods = new Good[amount];
        for (int i = 0; i < amount; i++) {
            goods[i] = new Clothers("T-shirt", 199);
        }
        return goods;
    }
}
