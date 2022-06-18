package org.javabasics;

public class C6PrefixAndPostfixOperators {
    public static void main(String[] args) {
        int x=3, y=4;
        x++;    // x is 4
        --y;    // y is 3

        System.out.println(x + " " + y);
        System.out.println(x++ + " " + --y);
        System.out.println(x + " " + y);
    }
}
