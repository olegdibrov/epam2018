package service;

import model.entity.Word;

public class Comparator implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Word)o1).getWord().compareTo(((Word)o2).getWord());
    }
}
