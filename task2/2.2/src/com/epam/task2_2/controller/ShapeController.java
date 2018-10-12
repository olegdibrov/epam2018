package com.epam.task2_2.controller;

import com.epam.task2_2.comparator.ShapesComparator;
import com.epam.task2_2.comparator.ShapesComparatorArea;
import com.epam.task2_2.data.DataShapes;
import com.epam.task2_2.input_utility.InputUtility;
import com.epam.task2_2.model.Shapes;
import com.epam.task2_2.view.ShapesView;

import java.util.Arrays;

/**
 * Created by maild on 12.10.2018.
 */
public class ShapeController {
    private Shapes model = new Shapes();
    private ShapesView view = new ShapesView();
    private DataShapes data = new DataShapes();
    private InputUtility inputUtility = new InputUtility();

    public void run() {
        data.setShapes(inputUtility.setAmountOfShapes(view.INPUT_NUMBER));
        model.setShapes(data.getShapes());
        view.printMessageAndShapes("All shapes:", model.getShapes());
        Arrays.sort(model.getShapes(), new ShapesComparator());
        view.printMessageAndShapes("Sorted shapes by color:", model.getShapes());
        Arrays.sort(model.getShapes(), new ShapesComparatorArea());
        view.printMessageAndShapes("Sorted shapes by area:", model.getShapes());
        view.printMessageAndArea(view.RESULT_AREA, model.getAllArea());
        view.printMessageAndArea(view.RESULT_CHOOSEN_AREA, model.getAreaByShape(inputUtility.setShapeToSearch(view.INPUT_NUMBER_FROM_0_TO_2)));
    }

}
