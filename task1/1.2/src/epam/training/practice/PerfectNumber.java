package epam.training.practice;

import java.util.ArrayList;

/**
 * Created by maild on 05.10.2018.
 */
public class PerfectNumber {
    private int range;

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void findPerfectNumbers(){
        for(int i = 1; i <= range; i++ ){
            int temp = 0;
            for (int j = 1; j <= i/2; j++ ){
                if (i%j == 0){
                    temp += j;
                }
            }
            if (temp == i){
                System.out.println(temp);
            }
        }
    }
}
