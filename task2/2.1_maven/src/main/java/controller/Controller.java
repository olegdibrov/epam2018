package controller;

import data.DataSource;
import data.DataSourceDefault;
import data.DataSourceFile;
import data.DataSourceManual;
import model.Books;
import model.entity.Book;
import service.BooksComparator;
import service.InputUtility;
import service.SerializeUtility;
import view.BookView;

import javax.swing.text.View;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by maild on 26.10.2018.
 */
public class Controller {
    private Books model = new Books();
    private BookView view = new BookView();
    private DataSource source;
    private InputUtility inputUtility = new InputUtility();

    {
        source = new DataSourceDefault();
        source.setBooks();
        model.setBooks(source.getBooks());
    }

    public void run() {
        chooseAction();
    }

    public void chooseAction() {
        Scanner sc = new Scanner(System.in);
        int action;
        boolean i = true;
        loop:
        while (i) {
            BookView.printMessage(view.CHOOSE_ACTION);
            BookView.printMessage(view.EXIT);
            BookView.printMessage(view.SHOW_BOOKS);
            BookView.printMessage(view.CHOOSE_SOURCE);
            BookView.printMessage(view.COMPARE_BY_AUTHOR);
            BookView.printMessage(view.GET_BY_AUTHOR);
            BookView.printMessage(view.GET_BY_PUBLISHER);
            BookView.printMessage(view.GET_BY_YEAR);
            BookView.printMessage(view.SERIALIZE);
            BookView.printMessage(view.DESERIALIZE);
            action = sc.nextInt();
            switch (action) {
                case 0:
                    break loop;
                case 1:
                    view.printMessageAndBooks(view.RESULT, model.getBooks());
                    break;
                case 2:
                    switch (inputUtility.chooseSearch(view.CHOICE_DATA_SOURCE)) {
                        case 1:
                            source = new DataSourceDefault();
                            source.setBooks();
                            model.setBooks(source.getBooks());
                            break;
                        case 2:
                            source = new DataSourceFile();
                            source.setBooks();
                            model.setBooks(source.getBooks());
                            break;
                        case 3:
                            source = new DataSourceManual();
                            source.setBooks();
                            model.setBooks(source.getBooks());
                            break;
                    }
                    break;
                case 3:
                    Arrays.sort(model.getBooks(), new BooksComparator());
                    view.printMessageAndBooks(view.RESULT_SORTED, model.getBooks());
                    break;
                case 4:
                    searchBooksByArgument(4);
                    break;
                case 5:
                    searchBooksByArgument(5);
                    break;
                case 6:
                    searchBooksByArgument(6);
                    break;
                case 7:
                    SerializeUtility.serialize(model);
                    break;
                case 8:
                    model = SerializeUtility.deserialize();
            }
        }
    }


    private void searchBooksByArgument(int argument) {
        switch (argument) {
            case 4:
                String author = inputUtility.setStringsValue(view.AUTHOR);
                Book[] result = model.getByAuthor(author);
                if (result.length == 0) {
                    view.printMessage("No books - " + author);
                } else {
                    view.printMessageAndBooks("\nAuthor - :" + author,
                            result);
                }
                break;
            case 5:
                String publisher = inputUtility.setStringsValue(view.PUBLISHER);
                result = model.getByPublisher(publisher);
                if (result.length == 0) {
                    view.printMessage("No books - " + publisher);
                } else {
                    view.printMessageAndBooks("\nPublisher - :" + publisher,
                            result);
                }
                break;
            case 6:
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
