package com.epam.task1_2.model;


/**
 * Created by maild on 05.10.2018.
 */
public class PerfectNumber {
    private int range;
    private String perfectNumbers;

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getPerfectNumbers() {
        return perfectNumbers;
    }

    public void setPerfectNumbers(String perfectNumbers) {
        this.perfectNumbers = perfectNumbers;
    }

    public void findPerfectNumbers(){
        perfectNumbers = "";
        for(int i = 1; i <= range; i++ ){
            int temp = 0;
            for (int j = 1; j <= i/2; j++ ){
                if (i%j == 0){
                    temp += j;
                }
            }
            if (temp == i){
                perfectNumbers += temp + "\n";
            }
        }
    }
}
