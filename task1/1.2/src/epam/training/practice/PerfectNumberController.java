package epam.training.practice;

/**
 * Created by maild on 05.10.2018.
 */
public class PerfectNumberController {
    private PerfectNumber model;
    private PerfectNumberView view;

    public PerfectNumberController(PerfectNumber model, PerfectNumberView view) {
        this.model = model;
        this.view = view;
    }

    public void outputPerfectNumbers(){
        model.setRange(InputUtility.inputValueWithScanner( view, view.INPUT_INT_VALUE));
        view.printMessage(view.OUTPUT);
        model.findPerfectNumbers();

    }
}
