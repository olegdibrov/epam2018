/**
 * Created by maild on 05.10.2018.
 */
public class ConverterController {
    private ConverterModel model;
    private ConverterView view;

    public ConverterController(ConverterModel model, ConverterView view) {
        this.model = model;
        this.view = view;
    }

    public void convert(){
        model.setValue(InputUtility.inputValueWithScanner( view, view.INPUT_INT_VALUE));
        model.setNotation(InputUtility.inputValueWithScanner( view, view.INPUT_INT_NOTATION));
        model.convertValue();
        view.printMessageAndResult(ConverterView.OUTPUT, model.getConvertedValue());
    }
}
