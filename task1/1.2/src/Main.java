import com.epam.task1_2.controller.PerfectNumberController;
import com.epam.task1_2.model.PerfectNumber;
import com.epam.task1_2.view.PerfectNumberView;

/**
 * Created by maild on 05.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        PerfectNumberController controller = new PerfectNumberController( new PerfectNumber(), new PerfectNumberView());
        controller.outputPerfectNumbers();
    }
}
