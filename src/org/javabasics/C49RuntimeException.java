package org.javabasics;

public class C49RuntimeException {
    static String s;                        // initiated to null by default
    public static void main(String[] args) {
        // nullPointerException();
        // arrayIntexOutOfBoundException();
        // numberFormatException();
        System.out.println(illegalArguementException(3));
        System.out.println(illegalArguementException(-2));
    }

    private static void nullPointerException(){
        int x = s.length();
    }

    private static void arrayIntexOutOfBoundException(){
        int []a = {1,2,3};
        int x = a[-6];
    }

    private static void numberFormatException(){
        int x = Integer.parseInt("2");      // ok
        int y = Integer.parseInt("two");    // Exception
    }

    private static double illegalArguementException(int num){
        if(num<0) {
            throw new IllegalArgumentException();
        }
        return java.lang.Math.pow(num,2);
    }
}
