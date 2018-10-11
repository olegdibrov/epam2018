package com.epam.task1_2.view;

/**
 * Created by maild on 05.10.2018.
 */
public class PerfectNumberView {
    public static final String INPUT_INT_VALUE = "Input integer value to convert";
    public static final String WRONG_INPUT_VALUE = "Wrong input value. Try again";
    public static final String OUTPUT = "All perfect numbers: ";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printMessageAndResult(String message, String numbers) {
        System.out.println(message + numbers);
    }
}
