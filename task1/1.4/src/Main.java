import com.epam.task1_3.controller.MatrixController;
import com.epam.task1_3.model.MatrixModel;
import com.epam.task1_3.view.MatrixView;

/**
 * Created by maild on 05.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        MatrixController controller = new MatrixController(new MatrixModel(), new MatrixView());
        controller.run();
    }
}
