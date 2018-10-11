package com.epam.task1_1.controller;

import com.epam.task1_1.input.InputUtility;
import com.epam.task1_1.model.ConverterModel;
import com.epam.task1_1.view.ConverterView;

/**
 * Created by maild on 05.10.2018.
 */
public class ConverterController {
    private ConverterModel model;
    private ConverterView view;

    public ConverterController(ConverterModel model, ConverterView view) {
        this.model = model;
        this.view = view;
    }

    public void convert(){
        model.setValue(InputUtility.inputValueWithScanner( view, view.INPUT_INT_VALUE));
        model.setNotation(InputUtility.inputValueWithScanner( view, view.INPUT_INT_NOTATION));
        view.printMessageAndResult(ConverterView.OUTPUT, model.convertValue());
    }
}
