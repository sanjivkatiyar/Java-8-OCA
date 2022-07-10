package org.enthuware.oca.test3;

public class Q5 {

    public static void printSum(Integer a, Integer b) {
        System.out.println("In Integer " + (a + b));
    }

    public static void printSum(double a, double b) {
        System.out.println("In double " + (a + b));      // widening is preferred over boxing
    }

    public static void main(String[] args) {
        printSum(1, 2);
    }
}
