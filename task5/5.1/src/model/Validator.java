package model;

import View.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static Scanner scanner = new Scanner(System.in);

    public static String inputSurname() {
        View.printMessage(View.ENTER_SURNAME);
        String value;
        while (true) {
            if (scanner.hasNext()) {
                value = scanner.next();
                if (value.matches("^([A-Z][a-z]+)(-[A-Z][a-z]+)?$")) {
                    return value;
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }


    public static String inputName() {
        View.printMessage(View.ENTER_NAME);
        String value;
        while (true) {
            if (scanner.hasNext()) {
                value = scanner.next();
                if (value.matches("^[A-Z][a-z]+$")) {
                    return value;
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }

    public static int[] inputDate() {
        View.printMessage(View.ENTER_DAY_OF_BIRTH);
        int[] date = new int[3];
        String value;
        while (true) {
            if (scanner.hasNext()) {
                value = scanner.next();
                if (value.matches("^((0[1-9])|([12]\\d)|([3][01])).(([0]\\d)|(1[0-2])).\\d{4}$")) {
                    String[] split = value.split("\\.");
                    date[0] = Integer.valueOf(split[0]);
                    date[1] = Integer.valueOf(split[1]);
                    date[2] = Integer.valueOf(split[2]);
                    return date;
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }

    public static String inputPhone() {
        View.printMessage(View.ENTER_PHONE_NUMBER);
        String value;
        while (true) {
            if (scanner.hasNext()) {
                value = scanner.next();
                if (value.matches("^\\+[1-9]\\d{2}\\(\\d{2}\\)(\\d{2}-){2}\\d{3}$")) {
                    return value;
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }

    public static String inputAddress() {
        View.printMessage(View.ENTER_ADDRESS);
        String value;
        while (true) {
            if (scanner.hasNext()) {
                scanner.nextLine();
                value = scanner.nextLine();
                if (value.matches("^((ул.)|(пр.)|(пер.))\\s(([А-Я][а-я]+)(-[А-я][А-я]+)?)\\s((дом)\\s\\d{0,5}[А-Яа-я]?(/\\d{0,5})?)(\\s(кв.)\\s\\d{0,5})?$")) {
                    return value;
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }

}
