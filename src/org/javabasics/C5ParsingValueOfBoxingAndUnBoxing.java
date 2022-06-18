package org.javabasics;

public class C5ParsingValueOfBoxingAndUnBoxing {

    public static void main(String[] args) {

        // parseXXX (String)
        int i = Integer.parseInt("33"); // parseInt returns an int
        double d = Double.parseDouble("2.3");
        float f = Float.parseFloat("4.4");

        System.out.println("i: " + i);
        System.out.println("d: " + d);
        System.out.println("f: " + f);

        // valueOf() preferred to using constructors (memory)
        Integer iw = Integer.valueOf(2); // better than using a constructor
        Integer iw1 = new Integer(2); // deprecated
        Integer iw2 = Integer.valueOf("22"); // overloaded
        Integer iw3 = Integer.valueOf("F", 16); // "F" treated as hex (base 16)

        System.out.println("iw: " + iw);
        System.out.println("iw1: " + iw1);
        System.out.println("iw2: " + iw2);
        System.out.println("iw3: " + iw3);

        // boxing/unboxing
        Integer x = 3; // auto-boxing
        int i1 = Integer.valueOf(3); // auto-unboxing

        System.out.println("x: " + x);
        System.out.println("i1: " + i1);
    }
}
