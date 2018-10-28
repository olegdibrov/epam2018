package com.epam.project_1.service;

import com.epam.project_1.model.enums.Color;
import com.epam.project_1.model.enums.ListOfGemStone;
import com.epam.project_1.model.enums.ListOfSemiPreciousStone;
import com.epam.project_1.model.entity.GemStone;
import com.epam.project_1.model.entity.SemiPreciousStone;
import com.epam.project_1.model.entity.Stone;

import java.util.*;
import java.util.List;

/**
 * Created by maild on 22.10.2018.
 */
public class Data {
    private List<Stone> stones;

    public List<Stone> getStones() {
        stones = new ArrayList<>();
        stones.add( new GemStone("C60", "mineral", 80, Color.PINK, 94, 999, ListOfGemStone.DIAMOND, 4));
        stones.add( new GemStone("Be3Al2Si6O18", "mineral", 65, Color.WHITE, 89, 899, ListOfGemStone.EMERALD, 3));
        stones.add( new GemStone("Al2 O3", "mineral", 50, Color.GREEN, 45, 699, ListOfGemStone.RUBY, 5));
        stones.add( new GemStone("Al2 O3", "mineral", 60, Color.WHITE, 49, 599, ListOfGemStone.SAPPHIRE, 4));
        stones.add( new SemiPreciousStone("SiO2", "mineral", 50, Color.GREEN, 50, 120, ListOfSemiPreciousStone.AMETHYST, 4));
        stones.add( new SemiPreciousStone("ZrSiO4", "mineral", 33, Color.RED, 30, 340, ListOfSemiPreciousStone.ZIRCON, 3));
        stones.add( new SemiPreciousStone("CuAl6(PO4)4(OH)8·4H2O", "mineral", 45, Color.WHITE, 41, 399, ListOfSemiPreciousStone.TURQUOISE, 5));
        stones.add( new SemiPreciousStone("X3Z2(TO4)3 ", "mineral", 45, Color.WHITE, 41, 199, ListOfSemiPreciousStone.GARNET, 9));
        stones.add( new SemiPreciousStone("Al2SiO4(F,OH)2", "mineral", 45, Color.WHITE, 41, 199, ListOfSemiPreciousStone.TOPAZ, 5));
        stones.add( new SemiPreciousStone("C10H16O", "mineral", 40, Color.BLACK, 92,230, ListOfSemiPreciousStone.AMBER, 8));
        stones.add( new SemiPreciousStone("2HCO3", "mineral", 50, Color.WHITE, 22, 190, ListOfSemiPreciousStone.CORAL, 4));
        return stones;
    }

}
