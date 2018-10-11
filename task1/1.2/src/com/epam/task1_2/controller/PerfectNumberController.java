package com.epam.task1_2.controller;

import com.epam.task1_2.model.PerfectNumber;
import com.epam.task1_2.input.InputUtility;
import com.epam.task1_2.view.PerfectNumberView;

/**
 * Created by maild on 05.10.2018.
 */
public class PerfectNumberController {
    private PerfectNumber model;
    private PerfectNumberView view;

    public PerfectNumberController(PerfectNumber model, PerfectNumberView view) {
        this.model = model;
        this.view = view;
    }

    public void outputPerfectNumbers(){
        model.setRange(InputUtility.inputValueWithScanner( view, view.INPUT_INT_VALUE));
        model.findPerfectNumbers();
        view.printMessageAndResult(view.OUTPUT,model.getPerfectNumbers() );
    }
}
