package controller;

import model.ListAndSet;
import service.InputUtility;
import view.View;

import java.util.Scanner;

public class Controller {
    View view = new View();
    ListAndSet model = new ListAndSet();

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
            View.printMessage(view.INPUT_RANGE);
            View.printMessage(view.SHOW_LIST_AND_SET);
            action = sc.nextInt();
            switch (action) {
                case 0:
                    break loop;
                case 1:
                    model = new ListAndSet(InputUtility.input());
                    break;
                case 2:
                    view.printMessageAndListSet(view.LIST_AND_SET, model.getList(), model.getSet());
                    break;

            }
        }
    }
}
