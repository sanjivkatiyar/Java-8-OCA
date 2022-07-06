package org.enthuware.oca.test1;

public class Q6 {
    public static void main(String args[ ] ){
        int i, j, k;
        i = j = k = 9;
        System.out.println(i);            // all variabes will get value 9

        boolean b = false;
        if( b = true) {
            System.out.println("TRUE");    // true
        }

        int ii = 5;
        // if(ii = 5){}                   // compilation error
    }
}
