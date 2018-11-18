package data;

import model.entity.Book;
import service.InputUtility;
import view.BookView;

public class DataSourceManual implements DataSource {

    private int amountOfBooks;
    private Book[] books;
    private InputUtility inputUtility;


    public void setBooks() {
        inputUtility = new InputUtility();
        amountOfBooks = inputUtility.setIntValue(BookView.INPUT_NUMBER);
        books = new Book[amountOfBooks];
        for (int i = 0; i < amountOfBooks; i++) {
            String name = inputUtility.setStringsValue(BookView.NAME);
            String author = inputUtility.setStringsValue(BookView.AUTHOR);
            String publisher = inputUtility.setStringsValue(BookView.PUBLISHER);
            int year = inputUtility.setIntValue(BookView.YEAR);
            int pages = inputUtility.setIntValue(BookView.PAGES);
            double price = inputUtility.setIntValue(BookView.PRICE);

            books[i] = new Book(name, author, publisher, year, pages, price);
        }
    }

    @Override
    public Book[] getBooks() {
        return books;
    }
}
