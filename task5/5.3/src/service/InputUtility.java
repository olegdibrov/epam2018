package service;

import view.View;

import java.util.Scanner;

public class InputUtility {
    public static Scanner scanner = new Scanner(System.in);

    public static String inputEnglishWord() {
        View.printMessage(View.ENTER_ENGLISH);
        String value;
        while (true) {
            if (scanner.hasNext()) {
                value = scanner.next();
                if (value.matches("[A-Z]?[a-z]+$")) {
                    return value.toLowerCase();
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }

    public static String inputRussianWord() {
        View.printMessage(View.ENTER_RUSSIAN);
        String value;
        while (true) {
            if (scanner.hasNext()) {
                value = scanner.next();
                if (value.matches("[А-Я]?[а-я]+$")) {
                    View.printMessage(View.SAVED);
                    return value.toLowerCase();
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }

    public static String inputPhrase() {
        View.printMessage(View.ENTER_PHRASE);
        String value;
        while (true) {
            if (scanner.hasNext()) {
                value = scanner.nextLine();
                if (value.length() > 1) {

                } else {
                    value = scanner.nextLine();
                }
                return value.toLowerCase();
            }
        }
    }
}
