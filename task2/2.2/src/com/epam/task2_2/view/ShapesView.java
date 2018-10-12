package com.epam.task2_2.view;

import com.epam.task2_2.model.entity.Shape;

/**
 * Created by maild on 12.10.2018.
 */
public class ShapesView {

    public static final String INPUT_NUMBER = "Enter number of shapes > 9: ";
    public static final String INPUT_NUMBER_FROM_0_TO_2 = "Enter number to sum area (0 - circle, 1 - rectangle, 2 - triangle) ";
    public static final String REPEAT = "Repeat input: ";
    public static final String ERROR_NUMBER = "Error: Input value < 10";
    public static final String ERROR_NUMBER_FROM_0_TO_2  = "Error: Input value < 0 or > 2";
    public static final String RESULT_AREA = "All area: ";
    public static final String RESULT_CHOOSEN_AREA = "All area in choosen shape: ";


    public static void printMessage(String message){
        System.out.print(message);
    }

    public  void printMessageAndShapes(String message, Shape[] shapes) {
        System.out.println(message);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("\n");
    }

    public void printMessageAndArea(String message, double area) {
        System.out.println(message + area);

    }
}
