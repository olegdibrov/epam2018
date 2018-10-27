package controller;

import data.DataSource;
import model.Books;
import model.entity.Book;
import service.BooksComparator;
import service.InputUtility;
import view.BookView;

import java.util.Arrays;

/**
 * Created by maild on 26.10.2018.
 */
public class Controller {
    private Books model = new Books();
    private BookView view = new BookView();
    private DataSource source = new DataSource();
    private InputUtility inputUtility = new InputUtility();

    public void run(){
        source.setBooks();
        model.setBooks(source.getBooks());
        view.printMessageAndBooks(view.RESULT, model.getBooks());
        Arrays.sort(model.getBooks(), new BooksComparator());
        view.printMessageAndBooks(view.RESULT_SORTED, model.getBooks());
        searchBooksByArgument(inputUtility.chooseSearch(view.INPUT_SEARCH));
    }

    private void searchBooksByArgument(int argument){
        switch (argument) {
            case 1:
                String author = inputUtility.setStringsValue(view.AUTHOR);
                Book[] result = model.getByAuthor(author);
                if (result.length == 0) {
                    view.printMessage("No books - " + author);
                } else {
                    view.printMessageAndBooks("\nAuthor - :" + author,
                            result);
                }
                break;
            case 2:
                String publisher = inputUtility.setStringsValue(view.PUBLISHER);
                result = model.getByAuthor(publisher);
                if (result.length == 0) {
                    view.printMessage("No books - " + publisher);
                } else {
                    view.printMessageAndBooks("\nPublisher - :" + publisher,
                            result);
                }
                break;
            case 3:
                int year = inputUtility.setIntValue(view.YEAR);
                result = model.getByLaterYear(year);
                if (result.length == 0) {
                    view.printMessage("No books - " + year);
                } else {
                    view.printMessageAndBooks("\nYear - :" + year,
                            result);
                }
                break;
        }
    }
}
