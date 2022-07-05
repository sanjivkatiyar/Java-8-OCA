package org.enthuware.oca.standard.foundationtest;

public class Q1 {
    public static void main(String args[]){
        System.out.println(factorial(100));
    }

    private static int factorial(int n){
        if(n==1) return 1;
        else return n*factorial(n-1);
    }
}
