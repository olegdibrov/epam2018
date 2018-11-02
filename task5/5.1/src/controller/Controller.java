package controller;

import View.View;
import model.Note;
import model.Notes;
import model.Validator;

import java.util.Scanner;

public class Controller {
    View view = new View();
    Notes model = new Notes();

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
            View.printMessage(view.SHOW_ALL_NOTES);
            View.printMessage(view.ADD_NOTE);
            action = sc.nextInt();
            switch (action) {
                case 0:
                    break loop;
                case 1:
                    view.printMessageAndNotes(View.NOTES, model.getNotes());
                    break;
                case 2:
                    model.getNotes().add(new Note(Validator.inputSurname(), Validator.inputName(), Validator.inputDate(), Validator.inputPhone(), Validator.inputAddress()));
                    break;

            }
        }
    }
}
