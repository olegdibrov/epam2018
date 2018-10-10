package epam.training.practice;

/**
 * Created by maild on 05.10.2018.
 */
public class PyramidController {
    private PyramidModel model;
    private PyramidView view;

    public PyramidController(PyramidModel model, PyramidView view) {
        this.model = model;
        this.view = view;
    }

    public void buildPyramid(){
        model.setHeight(InputUtility.inputValueWithScanner(view, view.INPUT_INT_VALUE));
        view.printMessageAndResult(view.OUTPUT, model.pyramid());
    }
}
