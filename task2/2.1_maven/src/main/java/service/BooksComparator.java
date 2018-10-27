package service;

import model.entity.Book;

import java.util.Comparator;

/**
 * Created by maild on 26.10.2018.
 */
public class BooksComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        String book1 = ((Book)o1).getPublisher();
        String book2 = ((Book)o2).getPublisher();
        return  book1.compareTo(book2);
    }
}
