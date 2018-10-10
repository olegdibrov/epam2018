package epam.training.practice;

/**
 * Created by maild on 05.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        MatrixController controller = new MatrixController(new MatrixModel(), new MatrixView());
        controller.showRotatedMatrix();
    }
}
