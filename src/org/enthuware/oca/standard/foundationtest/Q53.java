package org.enthuware.oca.standard.foundationtest;

public class Q53 {
    // Note that if no argument is passed to the program,
    // the args parameter is NOT null but a non-null array of Strings of length zero.
    public static void main(String[] args) {
        //In all of these cases, auto-unboxing of integers will occur.
        // For the last statement, after unboxing a and b, the value 12 will be boxed into an Integer object.
        int a=5, b=7, k=0;
        Integer m = null;

        k = new Integer(a) +new Integer(b);
        System.out.println(k);
        k = a + new Integer(b);
        System.out.println(k);
        m = new Integer(a)+new Integer(b);
        System.out.println(m);
    }
}
