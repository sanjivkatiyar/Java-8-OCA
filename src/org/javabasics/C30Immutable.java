package org.javabasics;

import java.util.ArrayList;

public class C30Immutable {
    public static void main(String[] args) {
        ImmutablePerson p1 = new ImmutablePerson("Joe Bloggs", 23);
        System.out.println(p1);
        ImmutablePerson p2 = new ImmutablePerson("Mary Bloggs", 24);
        System.out.println(p2);
        p1 = p2;
        System.out.println(p1);

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ann");
        employees.add("Liam");

        Department dept = Department.createInstance("Argos", "Athlone", 2, employees);
        System.out.println("Created: " + dept.toString());

        employees.add("Sanjiv");
        System.out.println("Created: " + dept.toString());
        System.out.println("Created: " + dept.getEmployees());

    }
}

final class ImmutablePerson{   // can not create sub-class
    // instance fields are final and private - can only be assigned once
    // at construction time - "blank final" (must be initialized in constructor)
    private final String name; // blank final
    private final int age;  // blank final

    // parameters are final - don't want to accidentally change them
    public ImmutablePerson(final String name,final int age) {
        this.name = name;
        this.age = age;
    }
    // no setter method i.e. state cannot be changed after construction
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

final class Department{ // cannot subclass this class are the methods are final
    // private final instance variables
    private final String name, address; // string is immutable
    private final int numEmployee;
    private final ArrayList<String> employees; // mutable

    // private constructor - cannot subclass this class because this constructor
    // cannot be invoked from subclass (hidden)
     private Department(String name, String address, int numEmployee, ArrayList<String> employees) {
        this.name = name;
        this.address = address;
        this.numEmployee = numEmployee;
        this.employees = new ArrayList<>(employees); // create a new ararylist // defencive copy
        // this.employees = employees; // breaking encapsulation
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public ArrayList<String> getEmployees() {
        return employees;
    }

    // factory method to create department
    public static Department createInstance(String name, String address, int numEmployee, ArrayList<String> employee){
        return new Department (name, address, numEmployee, employee);
    }
    public String toString(){
         return "name: " + name + " address: " + address + " numEmployees: " + numEmployee + " employees: " + employees;
    }
}

