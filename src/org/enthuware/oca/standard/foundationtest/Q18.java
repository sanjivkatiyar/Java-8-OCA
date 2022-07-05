package org.enthuware.oca.standard.foundationtest;

public class Q18 {
    static Integer i1 = 1;
    static Integer i2 = 1;
    static int i3 =1;
    static Byte b1 =1;
    static Long g1 = 1L;
    public static void main(String[] args) {

        System.out.println(i1==i2);     // false
        System.out.println(i1==i3);     // true Integer == int  will un-wrap and compare
        //System.out.println(i1==b1);   different classes with equal operator Integer == Byte
        //System.out.println(i1==g1);   Integer == Long
        System.out.println(i1.equals(g1));  // using equal operator coz it takes object
        System.out.println(i1.equals(b1));

    }
}
