package com.epam.task3_1.input;

import com.epam.task3_1.view.View;

import java.util.Scanner;

/**
 * Created by maild on 17.10.2018.
 */
public class InputUtility {
    Scanner scanner = new Scanner(System.in);

    public int setAmountOfShapes(String message) {
        View.printMessage(message);
        int value = 0;
        while(true) {
            value = scanner.nextInt();
            if ( value <= 5 || value >= 9 ){
                View.printMessage(View.ERROR_NUMBER_FROM_6_TO_8 + " " + View.REPEAT);
            }
            else break;
        }
        return value;
    }

}
