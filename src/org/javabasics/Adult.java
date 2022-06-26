package org.javabasics;

public class Adult {
    private String name;
    private int age;
    protected String address;
    public String badPractice;

    public Adult(String name, int age) {
        if (isAgeOk(age)) {
            this.age = age;
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean isAgeOk(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }
}
