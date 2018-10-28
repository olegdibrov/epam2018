package com.epam.project_1.service;

import com.epam.project_1.model.Necklace;
import com.epam.project_1.model.entity.GemStone;
import com.epam.project_1.model.entity.SemiPreciousStone;
import com.epam.project_1.model.entity.Stone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by maild on 24.10.2018.
 */
public class Action {

    public static double getTotalPrice(Necklace necklace) {
        double price = 0;
        for (Stone stone: necklace.getNecklace()) {
            price += stone.getPrice();
        }
        return price;
    }

    public static double getTotalWeight(Necklace necklace) {
        double weight = 0;
        for (Stone stone: necklace.getNecklace()) {
            if (stone instanceof SemiPreciousStone) {
                weight += ((SemiPreciousStone) stone).getWeight() * 5;
            }
            else {
                weight += ((GemStone)stone).getCarat();

            }
        }
        return weight;
    }

    public static List<Stone> getStonesByTransparency(Necklace necklace, int minTransparency, int maxTransparency) {
        List<Stone> temp = new ArrayList<>();
        Iterator iterator = necklace.getNecklace().iterator();
        while (iterator.hasNext()) {
            Stone tempStone = (Stone)iterator.next();
            if (tempStone.getTransparency() >= minTransparency && tempStone.getTransparency() <= maxTransparency) {
                temp.add(tempStone);
            }
        }
        return temp;
    }

    public static void addStonesToNecklace(String[] stones, Necklace necklace) {
        for (int i = 0; i < stones.length; i++) {
            necklace.addStone(stones[i]);
        }
    }

}
