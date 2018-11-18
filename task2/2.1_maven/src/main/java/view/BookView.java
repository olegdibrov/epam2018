package view;

import model.entity.Book;

/**
 * Created by maild on 26.10.2018.
 */
public class BookView {
    public static final String INPUT_NUMBER = "Enter number of books: ";
    public static final String INPUT_SEARCH = "Enter search method ( 1 - by author, 2 - by publisher, 3 - later year ): ";
    public static final String REPEAT = "Repeat input: ";
    public static final String ERROR_NUMBER = "Error: the number is not positive.";
    public static final String ERROR_FROM_1_TO_3 = "Error: Input value from 1 to 3.";
    public static final String ERROR = "Error";

    public static final String CHOOSE_ACTION = "Choose action";
    public static final String EXIT = "   0 - EXIT";
    public static final String SHOW_BOOKS = "   1 - Show all books";
    public static final String CHOOSE_SOURCE = "   2 - Choose source";
    public static final String COMPARE_BY_AUTHOR = "   3 - Compare by author and show books";
    public static final String GET_BY_AUTHOR = "   4 - Get books by author";
    public static final String GET_BY_PUBLISHER = "   5 - Get books by publisher";
    public static final String GET_BY_YEAR = "   6 - Get books later than";
    public static final String SERIALIZE = "   7 - Save books to file (serialize)";
    public static final String DESERIALIZE = "   8 - Open saved books from file (deserialize)";




    public static final String CHOICE_DATA_SOURCE = "1 - Default, 2 - from File, 3 - input manual";


    public static final String RESULT = "Result: ";
    public static final String RESULT_SORTED = "Sorted result: ";



    public static final String NAME = "Enter name of book: ";
    public static final String AUTHOR = "Enter author of book: ";
    public static final String PUBLISHER = "Enter publisher of book: ";
    public static final String YEAR = "Enter year of book: ";
    public static final String PAGES = "Enter number of pages: ";
    public static final String PRICE = "Enter price of book: ";



    public static void printMessage(String message){
        System.out.println(message);
    }

    public  void printMessageAndBooks(String message, Book[] books) {
        System.out.println(message);
        for (Book book : books) {
            System.out.println(book);

        }
        System.out.println("\n");
    }
}
