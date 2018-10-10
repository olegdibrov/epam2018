package epam.training.practice;

/**
 * Created by maild on 05.10.2018.
 */
public class PyramidModel {
    private int height;
    private String pyramid;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String pyramid() {
        pyramid = "";
        int fill = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2; j++) {
                if (j > height - 2 - i && j < height + i) {
                    if (j < height){
                        fill++;
                    }
                    else{
                        fill--;
                    }
                    pyramid += fill;
                } else if (j < height * 2 - 1) {
                    pyramid += " ";
                }
            }
            if (i < height - 1) {
                pyramid += (System.getProperty("line.separator"));
            }
            fill = 0;
        }
        return pyramid;
    }
}
