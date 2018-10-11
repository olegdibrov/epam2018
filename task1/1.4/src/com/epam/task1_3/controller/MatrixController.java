package com.epam.task1_3.controller;

import com.epam.task1_3.input.InputUtility;
import com.epam.task1_3.model.MatrixModel;
import com.epam.task1_3.view.MatrixView;

/**
 * Created by maild on 05.10.2018.
 */
public class MatrixController {
    MatrixModel model;
    MatrixView view;

    public MatrixController(MatrixModel model, MatrixView view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
        model.setN(InputUtility.inputValueWithScanner( view, view.INPUT_INT_VALUE));
        model.setMatrix(new int [model.getN()][model.getN()]);
        model.fillMatrixRandom();
        view.printMessageAndMatrix(view.MATRIX, model.getMatrix());
        model.rotateMatrix();
        view.printMessageAndMatrix(view.ROTATED_MATRIX, model.getMatrix());
    }
}
