package com.epam.task1_3.model;

/**
 * Created by maild on 05.10.2018.
 */
public class PyramidModel {
    private int height;
    private String pyramid;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String pyramid() {
        pyramid = "";
        int fill = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2; j++) {
               fill = findPlaceToFill(i, j, fill);
            }
            doLineSeparator(i);
            fill = 0;
        }
        return pyramid;
    }

    // finding place to fill numbers
    public int findPlaceToFill(int i, int j, int fill) {
        if (j > height - 2 - i && j < height + i) {
            if (j < height){
                fill++;
            }
            else{
                fill--;
            }
            pyramid += fill;
        } else if (j < height * 2 - 1) {
            pyramid += " ";
        }
        return fill;
    }

    //find end of line and insert line separator
    public void doLineSeparator(int i) {
        if (i < height - 1) {
            pyramid += "\n";
        }
    }
}
