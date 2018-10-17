package com.epam.task3_2.controller;

import com.epam.task3_2.input.InputUtility;
import com.epam.task3_2.model.Store;
import com.epam.task3_2.view.View;

import java.util.Arrays;

/**
 * Created by maild on 17.10.2018.
 */
public class Controller {

    private Store model = new Store("H&M" );
    private InputUtility input = new InputUtility();
    private View view = new View();

    public void run() {
        int i = 0;
        do {
            model.addDepartment(input.setStringsValue("Set name of department: "), input.setAmountOfGoods("Set location: "),
                    input.setAmountOfGoods("Set type of good (1,2,3): "));
            i = input.continueAddDepartment("Continue adding department (0 - yes, another - no): ");
        } while (i == 0);
        view.printMessageAndStrore("Store:", model);
        model.deleteDepartment(input.setStringsValue("Delete department: "));
        view.printMessageAndStrore("Store:", model);
        model.sortDepartments();
        view.printMessageAndStrore("Sorted department by department:", model);
    }
}
