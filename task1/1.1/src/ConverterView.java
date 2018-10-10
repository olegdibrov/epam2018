/**
 * Created by maild on 05.10.2018.
 */
public class ConverterView {
    public static final String INPUT_INT_VALUE = "Input integer value to convert";
    public static final String INPUT_INT_NOTATION = "Input integer notation";
    public static final String WRONG_INPUT_VALUE = "Wrong input value. Try again";
    public static final String OUTPUT = "Result of converting: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndResult(String message, String convertedValue){
        System.out.println(message + convertedValue);
    }
}
