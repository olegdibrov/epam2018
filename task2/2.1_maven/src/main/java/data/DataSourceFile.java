package data;

import model.entity.Book;
import service.InputUtility;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class DataSourceFile implements DataSource {
    private int amountOfBooks;
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks() {
        Path file = checkFile();
        try {
            FileInputStream fstream = new FileInputStream(file.toFile());
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            List<Book> booksList = new ArrayList();

            String temp;
            while ((temp = br.readLine()) != null){
                String[] values = temp.split(",");
                booksList.add(new Book(values[0].trim(), values[1].trim(), values[2].trim(), Integer.parseInt(values[3].trim()),
                        Integer.parseInt(values[4].trim()),
                        Double.parseDouble(values[5].trim())));
            }
            //books = (Book[]) booksList.toArray();
            books = booksList.stream().toArray(Book[]::new);


        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static Path checkFile() {
        Path file = null;
        try {
            file = Paths.get(InputUtility.enterFileName("Enter file name: "));
            if (!Files.exists(file)) {
                throw new FileNotFoundException();
            }
            return file;
        } catch (FileNotFoundException ex) {
            return checkFile();
        }
    }


}
