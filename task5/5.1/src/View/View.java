package View;

import model.Note;

import java.util.List;

public class View {
    public static final String CHOOSE_ACTION = "Choose action";
    public static final String EXIT = " 0 - EXIT";
    public static final String SHOW_ALL_NOTES = "1 - Show all notes";
    public static final String ADD_NOTE = "2 - Add note";


    public static final String ENTER_SURNAME = "Enter surname (Surname): ";
    public static final String ENTER_NAME = "Enter name (Name): ";
    public static final String ENTER_DAY_OF_BIRTH = "Enter day of birth (03.03.2003): ";
    public static final String ENTER_ADDRESS = "Enter address (ул./пр./пер. Крещатик дом 4 кв. 11): ";
    public static final String ENTER_PHONE_NUMBER = "Enter phone number (+380(66)11-11-111): ";
    public static final String ERROR = "Error. Try again!";
    public static final String NOTES = "All notes:";


    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessageAndNotes(String message, List<Note> notes) {
        System.out.println(message);
        for (Note note : notes) {
            System.out.println(note);
        }
    }

}
