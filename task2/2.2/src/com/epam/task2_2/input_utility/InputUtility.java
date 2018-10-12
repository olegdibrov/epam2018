package com.epam.task2_2.input_utility;

import com.epam.task2_2.view.ShapesView;

import java.util.Scanner;

/**
 * Created by maild on 12.10.2018.
 */
public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public int setAmountOfShapes(String message) {
        ShapesView.printMessage(message);
        int value = 0;
        while(true) {
            value = scanner.nextInt();
            if ( value <= 9  ){
                ShapesView.printMessage(ShapesView.ERROR_NUMBER + " " + ShapesView.REPEAT);
            }
            else break;
        }
        return value;
    }

    public int setShapeToSearch(String message) {
        ShapesView.printMessage(message);
        int value = 0;
        while(true) {
            value = scanner.nextInt();
            if (value < 0 && value >=3  ){
                ShapesView.printMessage(ShapesView.ERROR_NUMBER_FROM_0_TO_2 + " " + ShapesView.REPEAT);
            }
            else break;
        }
        return value;
    }
}
