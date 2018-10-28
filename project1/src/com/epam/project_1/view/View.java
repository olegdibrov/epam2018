package com.epam.project_1.view;

import com.epam.project_1.model.entity.Stone;

import java.util.List;

/**
 * Created by maild on 22.10.2018.
 */
public class View {
    public final static String ENTER_NUMBER = "Enter number: ";
    public final static String EXIT_FROM_APP = "0 - Exit from application ";
    public final static String CALCULATE__TOTAL_COST = "1 - Calculate total cost in necklace ";
    public final static String CALCULATE__TOTAL_WEIGHT = "2 - Calculate total weight (in carats) ";
    public final static String ADD_STONE = "3 - Add stone to necklace ";
    public final static String GET_STONES_BY_RANGE = "4 - Get stones by range of transparency (first parameter - min, second parameter - max) comma between words! )";
    public final static String SHOW_NECKLACE = "5 - Show all stones at necklace ";
    public final static String SORT_NECKLACE = "6 - Sort stones at necklace by price ";
    public final static String ENTER_STONE = " Enter stone what you would like to add. We have: Diamond, Emerald, Ruby, Sapphire, Amethyst , Zircon, Turquoise, Garnet, Topaz, Amber, Coral. Comma between words! ";
    public final static String TOTAL_COST = "Total cost: ";
    public final static String TOTAL_WEIGHT = "Total weight(in carats): ";
    public final static String CNANGED_NECKLACE = "Necklace with added stones: ";
    public final static String TOTAL_BY_RANGE = "All stones in necklace by range of transparency:  ";
    public static final String WRONG_NUMBERS = "Wrong number. Please, repeat " ;
    public static final String TOTAL_STONES = "All stones  at necklace: " ;
    public static final String SORTED_NECKLACE = "Sorted stones at necklace by price: " ;




    public static void printMessageAndStones(String message, List<Stone> stones) {
        System.out.println("\n" + message);
        for (Stone stone: stones) {
            System.out.println(stone);
        }
    }

    public static void printTotal(String name, double price) {
        System.out.println(name + price);
    }

    public static void  printMessage(String message) {
        System.out.println(message);
    }
}
