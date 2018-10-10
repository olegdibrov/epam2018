package epam.training.practice;

/**
 * Created by maild on 05.10.2018.
 */
public class MatrixModel {
    private int[][] matrix;
    private int N;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public void rotateMatrix()
    {
        for (int i = 0; i < N / 2; i++)
        {
            for (int j = i; j < N - i - 1; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][N - 1 - i];
                matrix[j][N - 1 - i] = matrix[N - 1 - i][N - 1 - j];
                matrix[N - 1 - i][N - 1 - j] = matrix[N - 1 - j][i];
                matrix[N - 1 - j][i] = temp;
            }
        }
    }

    public void displayMatrix()
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + matrix[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void fillMatrixRandom(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (10 - 5));
            }

        }

    }
}
