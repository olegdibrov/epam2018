package com.epam.task3_1.view;

import com.epam.task3_1.model.abstract_toy.KidsToys;

/**
 * Created by maild on 14.10.2018.
 */
public class View {
    public static final String INPUT_NUMBER = "Enter range (6 - 8) ";
    public static final String REPEAT = "Repeat input: ";
    public static final String ERROR_NUMBER_FROM_6_TO_8  = "Error: Inputted value < 6 or > 8";
    public static final String RESULT_TOYS = "All toys: ";
    public static final String RESULT_CHOOSEN_TOYS = "All area in choosen shape: ";
    public static final String SORTED_TOYS = "Sorted toys by price:" ;


    public static void showToys(String message, KidsToys[] toys) {
        System.out.println(message);
        for (KidsToys toy: toys) {
            System.out.println(toy.toString());
        }
        System.out.println();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
