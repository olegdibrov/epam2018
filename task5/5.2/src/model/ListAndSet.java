package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {
    List<Integer> list;
    Set<Integer> set;

    public ListAndSet() {
        list = new ArrayList<>();
        set = new HashSet<>();
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }


    public ListAndSet(String values) {
        String[] split = values.split(",");
        int size = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[1]);
        int max = Integer.parseInt(split[2]);

        list = new ArrayList<>();
        set = new HashSet<>();
        int tempMin = min;
        for (int i = 0; i < size; i++) {
            if (min > max) {
                min = tempMin;
            }
            if (set.size() <= max - tempMin) {
                set.add(min);
            }
            list.add(min);
            min++;
        }

    }
}
