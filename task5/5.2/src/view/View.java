package view;

import java.util.List;
import java.util.Set;

public class View {

    public static final String CHOOSE_ACTION = "Choose action";
    public static final String SAVED = "Range, min and max was saved";
    public static final String EXIT = "   0 - EXIT";
    public static final String INPUT_RANGE = "   1 - Input range , min and max";
    public static final String SHOW_LIST_AND_SET = "   2 - Show List and Set";


    public static final String ENTER_RANGE_MIN_MAX = "Enter range, min, max:";
    public static final String ERROR = "Error. Try again!";
    public static final String LIST_AND_SET = "All notes:";


    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessageAndListSet(String message, List<Integer> list, Set<Integer> set) {
        System.out.println(message);
        for (Integer integer: list) {
            System.out.println(integer);
        }
        System.out.println("\n");
        for (Integer integer: set) {
            System.out.println(integer);
        }
    }
}
