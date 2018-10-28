package com.epam.project_1.controller;

import com.epam.project_1.model.Necklace;
import com.epam.project_1.service.Action;
import com.epam.project_1.service.Comparator;
import com.epam.project_1.service.InputUtility;
import com.epam.project_1.view.View;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by maild on 24.10.2018.
 */
public class Controller {
    private Necklace model = new Necklace();
    private View view = new View();

    public void run() {
        model.addStone("RUBY");
        model.addStone("AMETHYST");
        model.addStone("AMBER");
        model.addStone("DIAMOND");
        view.printMessageAndStones("All stones at necklace", model.getNecklace());
        Collections.sort(model.getNecklace(), new Comparator());
        view.printMessageAndStones("Sorted by price: ", model.getNecklace());
        chooseAction();
    }

    public void chooseAction() {
        Scanner sc = new Scanner(System.in);
        int action;
        boolean i = true;
        loop: while (i) {
            View.printMessage(view.ENTER_NUMBER);
            View.printMessage(view.EXIT_FROM_APP);
            View.printMessage(view.CALCULATE__TOTAL_COST);
            View.printMessage(view.CALCULATE__TOTAL_WEIGHT);
            View.printMessage(view.ADD_STONE);
            View.printMessage(view.GET_STONES_BY_RANGE);
            View.printMessage(view.SHOW_NECKLACE);
            View.printMessage(view.SORT_NECKLACE);

            action = sc.nextInt();
            switch (action) {
                case 0:
                    break loop;
                case 1:
                    view.printTotal(view.TOTAL_COST, Action.getTotalPrice(model));
                    break;
                case 2:
                    view.printTotal(view.TOTAL_WEIGHT, Action.getTotalWeight(model));
                    break;
                case 3:
                    view.printMessage(view.ENTER_STONE);
                    Action.addStonesToNecklace(InputUtility.checkString(), model);
                    view.printMessageAndStones(view.CNANGED_NECKLACE, model.getNecklace());
                    break;
                case 4:
                    int[] minMax = InputUtility.checkTwoInt();
                    view.printMessageAndStones(view.TOTAL_BY_RANGE, Action.getStonesByTransparency(model,minMax[0], minMax[1]));
                    break;
                case 5:
                    view.printMessageAndStones(view.TOTAL_STONES, model.getNecklace());
                    break;
                case 6:
                    Collections.sort(model.getNecklace(), new Comparator());
                    view.printMessageAndStones(view.SORTED_NECKLACE, model.getNecklace());

            }
        }
    }

}
