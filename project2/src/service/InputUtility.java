package service;

import view.View;

import java.io.File;
import java.util.Scanner;

public class InputUtility {

    public static Scanner scanner = new Scanner(System.in);

    public static String inputFileName() {
        View.printMessage(View.ENTER_FILE);
        String name;
        while (true) {
            if (scanner.hasNext()) {
                name = scanner.next();
                File f = new File(name);
                if (f.exists()) {
                    return name;
                } else {
                    View.printMessage(View.ERROR);
                }
            }
        }
    }
}
