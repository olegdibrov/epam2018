import com.sun.org.apache.xpath.internal.operations.Bool;
import data.DataSource;
import model.Books;
import model.entity.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import service.BooksComparator;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by maild on 26.10.2018.
 */

public class BooksTest {
    private static Books books;
    private static Book [] arrayOfBooks;
    private static Book[] copyArrayOfBooks;
    private static Book [] sortedBooks;
    private static DataSource source;


    @BeforeAll
    static void init() {
        source = new DataSource();
        books = new Books();
        source.setBooks();
        arrayOfBooks = new Book [8] ;
        arrayOfBooks[0] = new Book("Title1", "Shevchenko",
                "BXV", 2010, 320, 450.0);
        arrayOfBooks[1] = new Book("Title2", "Shevchenko",
                "Word", 2000, 120, 250.0);
        arrayOfBooks[2] = new Book("Title3", "Sokolov",
                "BXV", 1999, 820, 1050.0);
        arrayOfBooks[3] = new Book("Title4", "Maslov",
                "Piter", 2016, 555, 620.5);
        arrayOfBooks[4] = new Book("Title5", "Sokolov",
                "Piter", 2011, 876, 555.5);
        arrayOfBooks[5] = new Book("Title6", "Sokolov",
                "BXV", 2001, 400, 300.0);
        arrayOfBooks[6] = new Book("Title7", "Petrov",
                "Word", 2018, 276, 155.5);
        arrayOfBooks[7] = new Book("Title8", "Shevchenko",
                "Piter", 2013, 456, 100.0);
        books.setBooks(arrayOfBooks);
        sortedBooks = new Book[8];
        sortedBooks[0] = arrayOfBooks[0];
        sortedBooks[1] = arrayOfBooks[2];
        sortedBooks[2] = arrayOfBooks[5];
        sortedBooks[3] = arrayOfBooks[3];
        sortedBooks[4] = arrayOfBooks[4];
        sortedBooks[5] = arrayOfBooks[7];
        sortedBooks[6] = arrayOfBooks[1];
        sortedBooks[7] = arrayOfBooks[6];
        copyArrayOfBooks = Arrays.copyOf(arrayOfBooks, 8);
    }



    @Test
    void testSetBooks() {
        assertArrayEquals(arrayOfBooks, source.getBooks());
    }


    @ParameterizedTest
    @ValueSource(strings = {"Shevchenko", "Sokolov", "Maslov"})
    void testGetByAuthor(String author) {
        boolean result = true;
        arrayOfBooks = books.getByAuthor(author);
        for (Book book : arrayOfBooks ) {
            if (!book.getAuthor().equals(author)) {
                result = false;
            }
        }
       assertTrue(result);

    }


    @ParameterizedTest
    @ValueSource(strings = {"BXV", "Word", "Piter"})
    void testGetByPublisher(String publisher) {
        boolean result = true;
        arrayOfBooks = books.getByPublisher(publisher);
        for (Book book : arrayOfBooks ) {
            if (!book.getPublisher().equals(publisher)) {
                result = false;
            }
        }
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2000, 1955})
    void testFetByLaterYear(int year) {
        boolean result = true;
        arrayOfBooks = books.getByLaterYear(year);
        for (Book book: arrayOfBooks) {
            if (!(book.getYear() >=  year)) {
                result = false;
            }
        }
        assertTrue(result);
    }


    @Test
    void testCompare() {
        Arrays.sort(copyArrayOfBooks, new BooksComparator());
        assertArrayEquals(sortedBooks, copyArrayOfBooks);
    }

}
