package controller;

import model.Text;
import service.Comparator;
import service.DataSource;
import service.InputUtility;
import view.View;

import java.util.Collections;
import java.util.Scanner;

public class Controller {
    Text model = new Text();
    View view = new View();

    public void run() {
        model.setText(DataSource.writeFileIntoString("text.txt"));
        Scanner sc = new Scanner(System.in);
        int action;
        boolean i = true;
        loop:
        while (i) {
            View.printMessage(view.CHOOSE_ACTION);
            View.printMessage(view.EXIT);
            View.printMessage(view.SHOW_WORDS);
            View.printMessage(view.SHOW_WORDS_BY_ALPHABET);
            View.printMessage(view.LOAD_FILE);
            action = sc.nextInt();
            switch (action) {
                case 0:
                    break loop;
                case 1:
                    View.printWordsInText(model);
                    break;
                case 2:
                    Collections.sort(model.getText(), new Comparator());
                    View.printTextByAlphabet(model);
                    break;
                case 3:
                    model.setText(DataSource.writeFileIntoString(InputUtility.inputFileName()));
                    break;
            }
        }
    }
}
