package epam.training.practice;

/**
 * Created by maild on 05.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        PyramidController controller = new PyramidController(new PyramidModel(), new PyramidView());
        controller.buildPyramid();
    }
}
