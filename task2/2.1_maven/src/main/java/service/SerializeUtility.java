package service;

import data.DataSource;
import data.DataSourceFile;
import model.Books;
import view.BookView;

import javax.swing.text.View;
import java.io.*;

public class SerializeUtility {
    public static void serialize(Books books) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(InputUtility.enterFileName("Enter file name: "))) ;
            oos.writeObject(books);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Books deserialize() {
        try {
            ObjectInputStream oos = new ObjectInputStream( new FileInputStream(String.valueOf(DataSourceFile.checkFile())));
            return (Books)oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            BookView.printMessage(BookView.ERROR);
            return deserialize();
        }
    }
}
