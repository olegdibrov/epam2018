package com.epam.task3_3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by maild on 17.10.2018.
 */
public class Enum <T> implements Comparable{
    private final String name;
    private final T[] argument ;
    private final int ordinal;
    public static int amountOfElements = -1;
    private static ArrayList<Enum> enums = new ArrayList<>();

    public String name() {
        return name;
    }

    public String getArgument() {
        String arguments = "";
        for (T arg : argument) {
            arguments += arg + ", ";
        }
        return arguments;
    }

    public int ordinal() {
        return ordinal;
    }

    public Enum() {
        name = null;
        argument = null;
        ordinal = -1;
    }

    public Enum(String name, T ... argument) {
        amountOfElements++;
        this.name = name;
        this.argument = argument;
        ordinal = amountOfElements ;
        enums.add(this);
    }

    @Override
    public String toString() {
        return "Enum{" +
                "Name='" + name + '\'' +
                ", argument=" + getArgument() +
                '}';
    }


    public static Enum valueOf(String nameOfEnum) {
        for (Enum tempEnum : enums) {
            if (tempEnum.name().equals(nameOfEnum)) {
                return tempEnum;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Enum<?> anEnum = (Enum<?>) o;

        if (name != null ? !name.equals(anEnum.name) : anEnum.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(argument, anEnum.argument);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(argument);
        return result;
    }


    @Override
    public int compareTo(Object o) {
        Enum other = (Enum)o;
        Enum<T> self = this;
        return self.ordinal - other.ordinal;
    }
}
