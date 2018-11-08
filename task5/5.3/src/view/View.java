package view;

import java.util.Map;

public class View {
    public static final String CHOOSE_ACTION = "Choose action";
    public static final String SAVED = "Words added to dictionary";
    public static final String EXIT = "   0 - EXIT";
    public static final String ADD_WORD = "   1 - Add word and translation to dictionary";
    public static final String TRANSLATE = "   2 - Translate phrase to russian";
    public static final String SHOW_DICTIONARY = "   3 - Show dictionary";

    public static final String ENTER_ENGLISH = "Enter word in English";
    public static final String ENTER_RUSSIAN = "Enter translate of the word (in russian)";
    public static final String ERROR = "Error! Try again.";

    public static final String ENTER_PHRASE = "Enter phrase in English:";


    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printDictionary(Map model) {
        System.out.println(model);
    }

}
