package com.epam.project_1.model;

import com.epam.project_1.model.entity.GemStone;
import com.epam.project_1.model.entity.SemiPreciousStone;
import com.epam.project_1.model.entity.Stone;
import com.epam.project_1.service.Data;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maild on 22.10.2018.
 */
public class Necklace {
    private List<Stone> necklace = new ArrayList();
    private List<Stone> allStones = new Data().getStones();

    public void addStone(String name) {
        for ( Stone stone: allStones ) {
            if (stone instanceof GemStone){
               if(((GemStone) stone).getName().name().equals(name)) {
                   necklace.add(stone);
               }
             }
            else {
                if(((SemiPreciousStone) stone).getName().name().equals(name)) {
                    necklace.add(stone);

                }
            }

        }
    }

    public List<Stone> getNecklace() {
        return necklace;
    }


}
