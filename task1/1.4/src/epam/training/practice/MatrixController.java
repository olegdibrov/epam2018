package epam.training.practice;

/**
 * Created by maild on 05.10.2018.
 */
public class MatrixController {
    MatrixModel model;
    MatrixView view;

    public MatrixController(MatrixModel model, MatrixView view) {
        this.model = model;
        this.view = view;
    }

    public void showRotatedMatrix(){
        model.setN(InputUtility.inputValueWithScanner( view, view.INPUT_INT_VALUE));
        model.setMatrix(new int [model.getN()][model.getN()]);
        model.fillMatrixRandom();
        model.displayMatrix();
        view.printMessage(view.OUTPUT);
        model.rotateMatrix();
        model.displayMatrix();
    }
}
