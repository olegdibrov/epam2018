package com.epam.task2_1.input_utility;

import com.epam.task2_1.model.entity.Book;
import com.epam.task2_1.view.BookView;

import java.util.Scanner;

/**
 * Created by maild on 10.10.2018.
 */
public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public int setIntValue(String message){
        BookView.printMessage(message);
        int value = 0;
        while(true) {
            value = scanner.nextInt();
            if (value <= 0 ){
                BookView.printMessage(BookView.ERROR_NUMBER + " " + BookView.REPEAT);
            }
            else break;
        }
        return value;
    }

    public String setStringsValue(String message){
        BookView.printMessage(message + "\n");
        String value;
        while(true) {
             value = scanner.next();
            if (value.length() == 0 ){
                BookView.printMessage(BookView.ERROR_NUMBER + " " + BookView.REPEAT);
            }
            else
                break;

        }
        return value;
    }

    public int chooseSearch(String message){
        BookView.printMessage(message);
        int value = 0;
        while(true) {
            value = scanner.nextInt();
            if (value <= 0 && value >=4 ){
                BookView.printMessage(BookView.ERROR_FROM_1_TO_3 + " " + BookView.REPEAT);
            }
            else break;
        }
        return value;
    }





}
