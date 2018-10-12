package com.epam.task2_2.data;

import com.epam.task2_2.model.entity.Circle;
import com.epam.task2_2.model.entity.Rectangle;
import com.epam.task2_2.model.entity.Shape;
import com.epam.task2_2.model.entity.Triangle;
import com.epam.task2_2.model.color.Colors;

/**
 * Created by maild on 12.10.2018.
 */
public class DataShapes {
    private Shape[] shapes;



    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(int amount) {
        shapes = new Shape[amount];
        for (int i = 0; i < shapes.length; i++) {
            int randomShape = (int) (Math.random() * 3);
            int randomColor = (int) (Math.random() * 5);
            int randomSide1 = (int) (Math.random() * 15) + 1;
            int randomSide2 = (int) (Math.random() * 15) + 1;
            switch (randomShape) {
                case 0:
                    shapes[i] = new Circle(Colors.masOfColors[randomColor], randomSide1);
                    break;
                case 1:
                    shapes[i] = new Rectangle(Colors.masOfColors[randomColor], randomSide1, randomSide2);
                    break;
                case 2:
                    shapes[i] = new Triangle(Colors.masOfColors[randomColor], randomSide1, randomSide2);
                    break;
            }

        }
    }
}
