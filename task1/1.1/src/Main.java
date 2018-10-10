/**
 * Created by maild on 05.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        ConverterController controller = new ConverterController(new ConverterModel(), new ConverterView());
        controller.convert();
    }
}
