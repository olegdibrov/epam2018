package data;

import model.entity.Book;
import service.InputUtility;


/**
 * Created by maild on 26.10.2018.
 */
public class DataSourceDefault implements DataSource{

    private int amountOfBooks;
    private Book[] books;

    private InputUtility inputUtility;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks() {
        books = new Book[8];
        books[0] = new Book("Title1", "Shevchenko", "BXV", 2010, 320, 450.0);
        books[1] = new Book("Title2", "Shevchenko", "Word", 2000, 120, 250.0);
        books[2] = new Book("Title3", "Sokolov",
                "BXV", 1999, 820, 1050.0);
        books[3] = new Book("Title4", "Maslov",
                "Piter", 2016, 555, 620.5);
        books[4] = new Book("Title5", "Sokolov",
                "Piter", 2011, 876, 555.5);
        books[5] = new Book("Title6", "Sokolov",
                "BXV", 2001, 400, 300.0);
        books[6] = new Book("Title7", "Petrov",
                "Word", 2018, 276, 155.5);
        books[7] = new Book("Title8", "Shevchenko",
                "Piter", 2013, 456, 100.0);
    }
}
