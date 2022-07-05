package org.enthuware.oca.standard.foundationtest;

public class Q26 {

    static {
        // throw new NullPointerException(); // compilation error
    }
    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println(Class.forName("java.lang.String"));

        int[] ia = {1,2,3};
        System.out.println(ia[3]);

        String s  = null;
        System.out.println(s.length());
    }
}
