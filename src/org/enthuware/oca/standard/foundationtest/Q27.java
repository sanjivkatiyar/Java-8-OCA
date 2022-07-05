package org.enthuware.oca.standard.foundationtest;

public class Q27 {
    static int k=0;
    static{
        if(true)                                 // if this line commented code will not compile
            throw new NullPointerException();    // ExceptionInInitializerError
    }
    static{
        k = k/0;                                  // ExceptionInInitializerError
    }
    public static void main(String[] args) {
        int[] ia = {1,2,3};
        System.out.println(ia[-1]);               // Array index out of bound
    }
}
