package com.epam.task3_1.data;

import com.epam.task3_1.model.abstract_toy.KidsToys;
import com.epam.task3_1.model.entity.Car;
import com.epam.task3_1.model.entity.Lego;
import com.epam.task3_1.model.entity.RadioControlled;

/**
 * Created by maild on 14.10.2018.
 */
public class DataToys {
    private KidsToys[] toys;

    public KidsToys[] getToys() {
        return toys;
    }

    public KidsToys[] setToys() {
        toys = new KidsToys[10];
        toys[0] = new RadioControlled("Lambo", 2999, " 1 month", "metal", "yellow", "Radio Controlled Car", 20,  "2 AA");
        toys[1] = new Lego("LEGO City", 5000, "2 months", "plastic", "8 colors", 1255);
        toys[2] = new Car("Honda", 1599, "1 year", "plastic", "black", 20, "1:20");
        toys[3] = new Lego("LEGO Friends", 1144, "3 months", "plastic", "8 colors", 589);
        toys[4] = new Lego("LEGO Minifigures", 159, "14 days", "plastic", "8 colors", 8);
        toys[5] = new Lego("LEGO NINJAGO", 3759, "14 days", "plastic", "8 colors", 1660);
        toys[6] = new RadioControlled("Helicopter SYMA X22W", 1890, "6 months", "plastic", "black", "Helicopter", 100, "3 AAA");
        toys[7] = new RadioControlled("Car Dickie Toys", 1879, "3 months", "plastic", "white", "Car", 39, "3 AAA");
        toys[8] = new Car("Toyota RAV4", 799, "1 year", "metal", "green", 20, "1:30");
        toys[9] = new Car("Jeep Wrangler", 899, "1 year", "metal", "grey", 20, "1:30");







        return toys;
    }

}
