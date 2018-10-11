package com.epam.task1_3.controller;

import com.epam.task1_3.input.InputUtility;
import com.epam.task1_3.model.PyramidModel;
import com.epam.task1_3.view.PyramidView;

/**
 * Created by maild on 05.10.2018.
 */
public class PyramidController {
    private PyramidModel model;
    private PyramidView view;

    public PyramidController(PyramidModel model, PyramidView view) {
        this.model = model;
        this.view = view;
    }

    public void buildPyramid(){
        model.setHeight(InputUtility.inputValueWithScanner(view, view.INPUT_INT_VALUE));
        view.printMessageAndResult(view.OUTPUT, model.pyramid());
    }
}
