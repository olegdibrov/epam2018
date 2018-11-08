package controller;

import model.Dictionary;
import service.InputUtility;
import view.View;

import java.util.Scanner;

public class Controller {
    View view = new View();
    Dictionary model = new Dictionary();

    public void run() {
        chooseAction();
    }

    public void chooseAction() {
        Scanner sc = new Scanner(System.in);
        int action;
        boolean i = true;
        loop:
        while (i) {
            View.printMessage(view.CHOOSE_ACTION);
            View.printMessage(view.EXIT);
            View.printMessage(view.ADD_WORD);
            View.printMessage(view.TRANSLATE);
            View.printMessage(view.SHOW_DICTIONARY);
            action = sc.nextInt();
            switch (action) {
                case 0:
                    break loop;
                case 1:
                    String engilsh = InputUtility.inputEnglishWord();
                    String russian = InputUtility.inputRussianWord();
                    model.addWords(engilsh, russian);
                    break;
                case 2:
                    view.printMessage(model.translateEnglishToRussian(InputUtility.inputPhrase()));
                    break;
                case 3:
                    view.printDictionary(model.getDictionary());

            }
        }
    }
}
