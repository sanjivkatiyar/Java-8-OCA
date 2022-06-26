package org.javabasics.model;

import org.javabasics.Adult;

public class SeniorCitizen extends Adult {
    public SeniorCitizen(String name, int age) {
        super(name, age);
    }

    void go() {
        address = "gateWay";
    }
}
