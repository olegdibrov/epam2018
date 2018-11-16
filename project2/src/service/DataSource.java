package service;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataSource {

    private static Path textFilePath;

    public static String writeFileIntoString(String filename) {

        File file = new File(filename);
        String str = null;

        try {
            if (file.length() != 0) {
                char[] charBuf = new char[(int) file.length()];
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
                final int read = isr.read(charBuf);
                str = new String(charBuf, 0, read);
                isr.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("can not find file");
        } catch (IOException e) {
            System.out.println("can not read file");
        }

        return str;
    }
}
