package org.enthuware.oca.standard.foundationtest;

public class Q64 {
    public static void main(String[] args) {
        Short k =999;
        Integer i = 9;
        Boolean b = false;
        char c = 'a';
        String str = "123";
        i = (int)k;
        System.out.println(i);
        i = (int)k.shortValue();
        System.out.println(i);

        str += b;
        System.out.println(str);
        b = !b;
        System.out.println(b);

        final int ii = 9;

        c = ii;

        c *= i;
        System.out.println(c);


    }
}
