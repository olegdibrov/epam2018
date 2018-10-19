package com.epam.task3_3.view;

import com.epam.task3_3.model.Animal;
import com.epam.task3_3.model.Enum;

/**
 * Created by maild on 19.10.2018.
 */
public class View {
    public static final String RESULT = "All animal names: ";

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public void printEnums(String message) {
        System.out.println(message);
        System.out.println(Animal.CAT.name() + " " + Animal.CAT.ordinal());
        System.out.println(Animal.DOG.name() + " " + Animal.DOG.ordinal());
        System.out.println(Animal.LION.name() + " " + Animal.LION.ordinal());
        System.out.println(Animal.TIGER.name() + " " + Animal.TIGER.ordinal());
        System.out.println("\n");
        System.out.println(Animal.CAT.equals(Animal.NEW_CAT));
        System.out.println(Animal.CAT.compareTo(Animal.LION));
        Enum newLion = Enum.valueOf("LION");
        System.out.println(newLion);
    }


}
