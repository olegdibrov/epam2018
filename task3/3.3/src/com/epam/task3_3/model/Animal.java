package com.epam.task3_3.model;

import java.util.ArrayList;

/**
 * Created by maild on 18.10.2018.
 */
public class Animal extends Enum {
    public static final Enum<String> CAT = new Enum<>("CAT", "Кошка");
    public static final Enum<String> DOG = new Enum<>("DOG", "Собака");
    public static final Enum<String> LION = new Enum<>("LION", "Лев");
    public static final Enum<String> TIGER = new Enum<>("TIGER", "Тигр");
    public static final Enum<String> NEW_CAT = new Enum<>("CAT", "Кошка");
}
