package com.epam.task3_3.controller;

import com.epam.task3_3.view.View;

/**
 * Created by maild on 19.10.2018.
 */
public class Controller {
    View view = new View();

    public void run() {
        view.printEnums(view.RESULT);
    }
}
