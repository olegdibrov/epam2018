package com.epam.task3_2.view;

import com.epam.task3_2.model.Store;

/**
 * Created by maild on 17.10.2018.
 */
public class View {

    public static final String WRONG_INPUT_INT_DATA = "Wrong input. Repeat please.";


    public static void printMessage(String message){
        System.out.print(message);
    }


    public  void printMessageAndStrore(String message, Store store) {
        System.out.println(message);
        System.out.println(store.toString());
        System.out.println("\n");
    }
}
