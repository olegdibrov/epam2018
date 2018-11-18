package service;

import model.entity.Book;
import view.BookView;

import java.util.Scanner;

/**
 * Created by maild on 26.10.2018.
 */
public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public int setIntValue(String message) {
        BookView.printMessage(message);
        int value = 0;
        while (true) {
            try {
                value = Integer.parseInt(scanner.next());
                if (value <= 0) {
                    BookView.printMessage(BookView.ERROR_NUMBER + " " + BookView.REPEAT);
                } else return value;
            } catch (ClassCastException | NumberFormatException ex) {
                BookView.printMessage(BookView.ERROR + " " + BookView.REPEAT);
                return setIntValue(message);
            }

        }
    }

    public String setStringsValue(String message) {
        BookView.printMessage(message + "\n");
        String value;
        while (true) {
            value = scanner.next();
            if (value.length() == 0) {
                BookView.printMessage(BookView.ERROR_NUMBER + " " + BookView.REPEAT);
            } else
                break;

        }
        return value;
    }

    public int chooseSearch(String message) {
        BookView.printMessage(message);
        int value = 0;
        while (true) {
            value = scanner.nextInt();
            if (value <= 0 && value >= 4) {
                BookView.printMessage(BookView.ERROR_FROM_1_TO_3 + " " + BookView.REPEAT);
            } else break;
        }
        return value;
    }

    public int chooseSource(String message) {
        BookView.printMessage(message);
        int value = 0;
        while (true) {
            try {
                value = Integer.parseInt(scanner.next());
                if (value <= 0 && value >= 4) {
                    BookView.printMessage(BookView.ERROR_FROM_1_TO_3 + " " + BookView.REPEAT);
                } else return value;
            } catch (ClassCastException  | NumberFormatException ex) {
                BookView.printMessage(BookView.ERROR + " " + BookView.REPEAT);
                return chooseSearch(message);
            }
        }
    }

    public static String enterFileName(String message) {
        BookView.printMessage(message + "\n");
        String value;
        while (true) {
            value = scanner.next();
            if (value.length() == 0) {
                BookView.printMessage(BookView.ERROR + " " + BookView.REPEAT);
            } else
                break;
        }
        return value;
    }
}
