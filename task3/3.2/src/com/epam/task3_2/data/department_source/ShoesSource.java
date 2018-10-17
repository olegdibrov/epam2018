package com.epam.task3_2.data.department_source;

import com.epam.task3_2.model.entity.Clothers;
import com.epam.task3_2.model.entity.Good;
import com.epam.task3_2.model.entity.Shoes;

/**
 * Created by maild on 17.10.2018.
 */
public class ShoesSource {

    public Good[] getShoes(int amount, Good[] goods) {
        goods = new Good[amount];
        for (int i = 0; i < amount; i++) {
            goods[i] = new Shoes("Boots", 1999);
        }
        return goods;
    }
}
