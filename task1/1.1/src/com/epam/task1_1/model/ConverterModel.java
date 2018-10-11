package com.epam.task1_1.model;

/**
 * Created by maild on 05.10.2018.
 */
public class ConverterModel {
    private int value;
    private int notation;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNotation() {
        return notation;
    }

    public void setNotation(int notation) {
        this.notation = notation;
    }

    public String convertValue(){
        String temp = "";
        while (value!=0){

            switch(value%notation){
                case (10):
                    temp += "A";
                    break;
                case (11):
                    temp += "B";
                    break;
                case (12):
                    temp += "C";
                    break;
                case (13):
                    temp += "D";
                    break;
                case (14):
                    temp += "E";
                    break;
                case (15):
                    temp += "F";
                    break;
                default:
                    temp += value%notation;
            }
            value /= notation;
        }
        return changeDirection(temp);
    }

    private String changeDirection( String changedValue){
        String changedDirectionValue = "";
        for (int i = changedValue.length() - 1; i >= 0; i-- ){
            if (((i+1)%4 == 0) && (i != changedValue.length() - 1)){
                changedDirectionValue += "_";
            }
            changedDirectionValue += changedValue.charAt(i);
        }
        return changedDirectionValue;
    }
}

