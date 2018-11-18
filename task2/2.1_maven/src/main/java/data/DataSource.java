package data;

import model.entity.Book;

public interface DataSource {
    void setBooks();
    Book[] getBooks();
}
