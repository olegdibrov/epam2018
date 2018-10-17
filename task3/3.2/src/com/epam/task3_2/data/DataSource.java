package com.epam.task3_2.data;

import com.epam.task3_2.data.department_source.AccessoriesSource;
import com.epam.task3_2.data.department_source.ClothersSource;
import com.epam.task3_2.data.department_source.ShoesSource;
import com.epam.task3_2.model.Store;
import com.epam.task3_2.model.entity.Accessories;
import com.epam.task3_2.model.entity.Clothers;
import com.epam.task3_2.model.entity.Good;
import com.epam.task3_2.model.entity.Shoes;

import java.util.ArrayList;

/**
 * Created by maild on 17.10.2018.
 */
public class DataSource {
    private Good[] goods;

    public Good[] getGoods(int department, int amountOfGoods ) {
        switch (department) {
            case 1:
                goods = new ClothersSource().getClothers(amountOfGoods, goods);
                break;
            case 2:
                goods = new ShoesSource().getShoes(amountOfGoods, goods);
                break;
            case 3:
                goods = new AccessoriesSource().getAccessories(amountOfGoods, goods);
                break;
        }
        return goods;
    }


}
