package com.epam.task1_3.view;

/**
 * Created by maild on 05.10.2018.
 */
public class PyramidView {
    public static final String INPUT_INT_VALUE = "Input integer value from (1 to 9)";
    public static final String WRONG_INPUT_VALUE = "Wrong input value. Try again";
    public static final String OUTPUT = "Pyramid: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndResult(String message, String pyramid){
        System.out.println(message);
        System.out.println(pyramid);
    }
}
