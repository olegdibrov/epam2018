package com.epam.task3_1.model;

import com.epam.task3_1.model.abstract_toy.KidsToys;
import com.epam.task3_1.model.entity.Car;
import com.epam.task3_1.model.entity.Lego;
import com.epam.task3_1.model.entity.Puzzle;
import com.epam.task3_1.model.entity.RadioControlled;

import java.util.Arrays;

/**
 * Created by maild on 13.10.2018.
 */
public class GameRoom <T extends KidsToys> {
    private T[] kidsToys;

    public T[] getKidsToys() {
        return kidsToys;
    }

    public void setKidsToys(T[] kidsToys) {
        this.kidsToys = kidsToys;
    }

    public double costOfToys() {
        double cost = 0;
        for (T toy: kidsToys ) {
            cost += toy.getPrice();
        }
        return cost;
    }


    public KidsToys[] rangeOfParameters( int parameter) {
        KidsToys[] temp = new KidsToys[kidsToys.length];
        int counter = 0;
        for (T toy: kidsToys ) {
            switch (parameter) {
                case 6 :
                    if ( toy instanceof Lego || toy instanceof Puzzle) {
                        temp[counter++] = toy;
                    }
                    break;
                case 7 :
                    if ( toy instanceof Car) {
                        temp[counter++] = toy;
                    }
                    break;
                case 8 :
                    if ( toy instanceof RadioControlled) {
                        temp[counter++] = toy;
                    }
                    break;

            }
        }
        return Arrays.copyOf(temp, counter);
    }


}
