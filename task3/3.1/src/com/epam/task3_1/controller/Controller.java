package com.epam.task3_1.controller;

import com.epam.task3_1.comparator.ComparatorByPrice;
import com.epam.task3_1.data.DataToys;
import com.epam.task3_1.input.InputUtility;
import com.epam.task3_1.model.GameRoom;
import com.epam.task3_1.model.abstract_toy.KidsToys;
import com.epam.task3_1.view.View;

import java.util.Arrays;

/**
 * Created by maild on 13.10.2018.
 */
public class Controller {
    private View view = new View();
    private GameRoom<KidsToys> gameRoom = new GameRoom<>();
    private InputUtility input = new InputUtility();

    public void run() {
        gameRoom.setKidsToys(new DataToys().setToys());
        view.showToys(view.RESULT_TOYS, gameRoom.getKidsToys());
        Arrays.sort(gameRoom.getKidsToys(), new ComparatorByPrice());
        view.showToys(view.SORTED_TOYS, gameRoom.getKidsToys());
        view.showToys(view.RESULT_CHOOSEN_TOYS, gameRoom.rangeOfParameters(input.setAmountOfShapes(view.INPUT_NUMBER)));
    }
}
