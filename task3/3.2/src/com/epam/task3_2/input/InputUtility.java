package com.epam.task3_2.input;

import com.epam.task3_2.view.View;

import java.util.Scanner;

/**
 * Created by maild on 17.10.2018.
 */
public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public int setDepartment(String message) {
        View.printMessage(message);
        int value = 0;
        while(true) {
            value = scanner.nextInt();
            if ( value <= 0 || value > 3  ){
                View.printMessage(View.WRONG_INPUT_INT_DATA);
            }
            else break;
        }
        return value;
    }

    public int setAmountOfGoods(String message) {
        View.printMessage(message);
        int value = 0;
        while(true) {
            value = scanner.nextInt();
            if ( value <= 0 ){
                View.printMessage(View.WRONG_INPUT_INT_DATA);
            }
            else break;
        }
        return value;
    }

    public String setStringsValue(String message){
        View.printMessage(message);
        String value;
        while(true) {
            value = scanner.next();
            if (value.length() == 0 ){
                View.printMessage(View.WRONG_INPUT_INT_DATA);
            }
            else
                break;

        }
        return value;
    }

    public int continueAddDepartment(String message) {
        View.printMessage(message);
        return scanner.nextInt();
    }


}
