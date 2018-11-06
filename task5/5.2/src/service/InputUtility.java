package service;

import view.View;

import java.util.Scanner;

public class InputUtility {
    public static Scanner scanner = new Scanner(System.in);

    public static String input() {
        View.printMessage(View.ENTER_RANGE_MIN_MAX);
        String value;
        while (true) {
            if (scanner.hasNext()) {
                value = scanner.next();
                String[] split = value.split(",");
                int range = Integer.parseInt(split[0]);
                int min = Integer.parseInt(split[1]);
                int max = Integer.parseInt(split[2]);
                if ( min < max && range > 0 && range >= (max - min)) {
                    View.printMessage(View.SAVED);
                    return value;
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }
}