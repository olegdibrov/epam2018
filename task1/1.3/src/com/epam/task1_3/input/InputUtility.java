package com.epam.task1_3.input;

import com.epam.task1_3.view.PyramidView;

import java.util.Scanner;

/**
 * Created by maild on 05.10.2018.
 */
public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputValueWithScanner(PyramidView view, String message){
        int value = 0;
        view.printMessage(message);
        while (true) {
            value = sc.nextInt();
            if (value >= 1 && value <= 9) {
                break;
            }
            view.printMessage(view.WRONG_INPUT_VALUE);
        }
        return value;
    }
}
