package com.epam.project_1.service;

import com.epam.project_1.view.View;

import java.util.Arrays;
import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static String[] checkString() {
        String tempStones = scanner.next();
        String[] stones = tempStones.split(",");
        for (int i = 0; i < stones.length; i++) {
            stones[i] = stones[i].toUpperCase();
        }
        return stones;
    }

    public static int[] checkTwoInt() {
        int[] minMax = new int[2];
        String minAndMax = scanner.next();
        String[] tempMinAndMax = minAndMax.split(",");
        if( tempMinAndMax.length != 2 || (Integer.parseInt(tempMinAndMax[0]) > Integer.parseInt(tempMinAndMax[1]))) {
            View.printMessage(View.WRONG_NUMBERS);
            checkTwoInt();
        }
        else{
            minMax[0] = Integer.parseInt(tempMinAndMax[0]);
            minMax[1] = Integer.parseInt(tempMinAndMax[1]);
        }
        return minMax;
    }
}
