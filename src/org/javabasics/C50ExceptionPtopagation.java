package org.javabasics;

public class C50ExceptionPtopagation {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        int x = 7/0;                          // can not divide by 0
    }                                         // Arithmetic exception thrown which is a RuntimeException
}
