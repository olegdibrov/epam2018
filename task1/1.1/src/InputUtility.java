import java.util.Scanner;

/**
 * Created by maild on 05.10.2018.
 */
public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputValueWithScanner(ConverterView view, String message){
        view.printMessage(message);
        while (!sc.hasNextInt()){
            view.printMessage(view.WRONG_INPUT_VALUE);
            view.printMessage(message);
            sc.next();
        }
        return Math.abs(sc.nextInt());
    }
}
