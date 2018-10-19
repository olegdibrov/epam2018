package com.epam.task3_3.model;

/**
 * Created by maild on 19.10.2018.
 */
public class Season extends Enum {
    public static final Enum<Integer> WINTER = new Enum<>("WINTER", 1);
    public static final Enum<Integer> SPRING = new Enum<>("SPRING", 2);
    public static final Enum<Integer> SUMMER = new Enum<>("SUMMER", 3);
    public static final Enum<Integer> AUTUMN = new Enum<>("AUTUMN", 4);
}
