package com.epam.task2_1.view;

import com.epam.task2_1.model.Books;
import com.epam.task2_1.model.entity.Book;

/**
 * Created by maild on 10.10.2018.
 */
public class BookView {
    public static final String INPUT_NUMBER = "Enter number of books: ";
    public static final String INPUT_SEARCH = "Enter search method ( 1 - by author, 2 - by publisher, 3 - later year ): ";
    public static final String REPEAT = "Repeat input: ";
    public static final String ERROR_NUMBER = "Error: the number is not positive.";
    public static final String ERROR_FROM_1_TO_3 = "Error: Input value from 1 to 3.";
    public static final String RESULT = "Result: ";
    public static final String RESULT_SORTED = "Sorted result: ";



    public static final String NAME = "Enter name of book: ";
    public static final String AUTHOR = "Enter author of book: ";
    public static final String PUBLISHER = "Enter publisher of book: ";
    public static final String YEAR = "Enter year of book: ";
    public static final String PAGES = "Enter number of pages: ";
    public static final String PRICE = "Enter price of book: ";



    public static void printMessage(String message){
        System.out.print(message);
    }

    public  void printMessageAndBooks(String message, Book[] books) {
        System.out.println(message);
        for (Book book : books) {
            System.out.println(book);

        }
        System.out.println("\n");
    }
}
