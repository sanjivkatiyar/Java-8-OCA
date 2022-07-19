package org.javaadvanced;

import java.util.ArrayList;
import java.util.function.Predicate;

public class C29LambdaEffectivlyFinal {
    static String name = "";

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("John");

        int x = 12; //final or effectively final

        Predicate<String> predicate = s ->{
            name ="Test";                          // instance or class variable
            al.add(name);
            // ++x;                                // not ok local variable
            return s.isEmpty() && x%2==0;
        };

        predicate.test("Sanjiv");
        System.out.println(name);
        System.out.println(al);
        // ++x;                                   // not okay error at line 19


    }
}
