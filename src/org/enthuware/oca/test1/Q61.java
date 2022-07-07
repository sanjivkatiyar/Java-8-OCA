package org.enthuware.oca.test1;

public class Q61 {
    public static void main(String args[ ] ){
        byte b = -128 ;
        System.out.println(b);
        int i = b ;
        System.out.println(i);
        b = (byte) i;
        System.out.println(i+" "+b);
    }
}
