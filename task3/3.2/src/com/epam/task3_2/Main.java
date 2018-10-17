package com.epam.task3_2;

import com.epam.task3_2.controller.Controller;

import javax.naming.ldap.Control;

/**
 * Created by maild on 17.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        new Controller().run();
    }
}
