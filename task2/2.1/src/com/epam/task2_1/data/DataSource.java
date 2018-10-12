package com.epam.task2_1.data;

import com.epam.task2_1.input_utility.InputUtility;
import com.epam.task2_1.model.entity.Book;
import com.epam.task2_1.view.BookView;

/**
 * Created by maild on 10.10.2018.
 */
public class DataSource {
    private int amountOfBooks;
    private Book[] books;

    private InputUtility inputUtility;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(){
        inputUtility = new InputUtility();
        amountOfBooks = inputUtility.setIntValue(BookView.INPUT_NUMBER);
        books = new Book[amountOfBooks];
        for (int i = 0; i < amountOfBooks; i++){
            String name = inputUtility.setStringsValue(BookView.NAME);
            String author = inputUtility.setStringsValue(BookView.AUTHOR);
            String publisher = inputUtility.setStringsValue(BookView.PUBLISHER);
            int year = inputUtility.setIntValue(BookView.YEAR);
            int pages = inputUtility.setIntValue(BookView.PAGES);
            double price = inputUtility.setIntValue(BookView.PRICE);

            books[i] = new Book(name, author, publisher, year, pages, price);
        }
    }
}
