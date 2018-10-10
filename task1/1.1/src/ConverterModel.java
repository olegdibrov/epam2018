/**
 * Created by maild on 05.10.2018.
 */
public class ConverterModel {
    private int value;
    private int notation;
    private String convertedValue = "";

    public String getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(String convertedValue) {
        this.convertedValue = convertedValue;
    }

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

    public void convertValue(){
        while (value!=0){
            String temp = "";
            switch(value%notation){
                case (10):
                    convertedValue += "A";
                    break;
                case (11):
                    convertedValue += "B";
                    break;
                case (12):
                    convertedValue += "C";
                    break;
                case (13):
                    convertedValue += "D";
                    break;
                case (14):
                    convertedValue += "E";
                    break;
                case (15):
                    convertedValue += "F";
                    break;
                default:
                    convertedValue += value%notation;
            }
            value /= notation;
        }
        convertedValue = changeDirection(convertedValue);
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

