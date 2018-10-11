package com.epam.task1_3;

import com.epam.task1_3.controller.PyramidController;
import com.epam.task1_3.model.PyramidModel;
import com.epam.task1_3.view.PyramidView;

/**
 * Created by maild on 05.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        PyramidController controller = new PyramidController(new PyramidModel(), new PyramidView());
        controller.buildPyramid();
    }
}
