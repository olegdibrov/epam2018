package com.epam.task3_2.data.department_source;

import com.epam.task3_2.model.entity.Accessories;
import com.epam.task3_2.model.entity.Good;

/**
 * Created by maild on 17.10.2018.
 */
public class AccessoriesSource {

    public Good[] getAccessories(int amount, Good[] goods) {
        goods = new Good[amount];
        for (int i = 0; i < amount; i++) {
            goods[i] = new Accessories("Watches", 999);
        }
        return goods;
    }
}
