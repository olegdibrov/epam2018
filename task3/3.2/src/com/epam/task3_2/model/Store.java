package com.epam.task3_2.model;

import com.epam.task3_2.data.DataSource;
import com.epam.task3_2.input.InputUtility;
import com.epam.task3_2.model.entity.Good;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by maild on 17.10.2018.
 */
public class Store {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();
    private InputUtility input = new InputUtility();


    public Store(String name) {
        this.name = name;
    }

    public void addDepartment(String nameOfDepartment, int location, int typeOfGood) {
        departments.add( new Department(nameOfDepartment,location, new DataSource().getGoods(
                typeOfGood, input.setAmountOfGoods("Set amount of goods"))));
    }

    public void deleteDepartment(String nameOfDepartment) {
        for (int i = 0; i < departments.size(); i++ ) {
            if (departments.get(i).getNameOfDepartment().equals(nameOfDepartment)) {
                departments.remove(i);
            }

        }
    }

    public void sortDepartments() {
        departments.sort(new Department());
    }



    private class Department implements Comparator {
        private String nameOfDepartment;
        private int location;
        private Good[] goods;

        public String getNameOfDepartment() {
            return nameOfDepartment;
        }

        public void setNameOfDepartment(String nameOfDepartment) {
            this.nameOfDepartment = nameOfDepartment;
        }

        public Department() {
        }

        public Department(String nameOfDepartment, int location, Good[] goods) {
            this.nameOfDepartment = nameOfDepartment;
            this.location = location;
            this.goods = goods;
        }

        @Override
        public int compare(Object o1, Object o2) {
            String name1 = ((Department)o1).getNameOfDepartment();
            String name2 = ((Department)o2).getNameOfDepartment();
            return name1.compareTo(name2);
        }

        @Override
        public String toString() {
            return   nameOfDepartment + ": " +
                    "location=" + location +
                    "\n Goods:\n" + Arrays.toString(goods) + "\n";
        }

    }

    @Override
    public String toString() {
        return "Store " + name + "\n" +
                "Departments: " + "\n" + departments ;
    }
}
