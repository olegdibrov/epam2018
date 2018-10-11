package com.epam.task1_3.view;

/**
 * Created by maild on 05.10.2018.
 */
public class MatrixView {
    public static final String INPUT_INT_VALUE = "Input integer value";
    public static final String WRONG_INPUT_VALUE = "Wrong input value. Try again";
    public static final String MATRIX = "Matrix: ";
    public static final String ROTATED_MATRIX = "Result of rotating: ";

    public void printMessage(String message){
        System.out.println(message);
    }


    public void printMessageAndMatrix(String message, int[][] matrix){
        System.out.println(message);
        String numberDigits;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++) {
                numberDigits = Integer.toString(matrix[i][j]);
                switch (numberDigits.length()){
                    case 1 :
                        System.out.print("  ");
                        break;
                    case 2 :
                        System.out.print(" ");
                        break;
                    case 3 :
                        break;
                }
                System.out.print(matrix[i][j] + " ");
            }

            System.out.print("\n");
        }
    }


}
