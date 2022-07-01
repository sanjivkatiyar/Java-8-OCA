package org.javabasics;

public class C53FinallyBlock {
    public static void main(String[] args) {
        ex1(+8);
        ex1(-4);
        ex2();
    }
    public static void ex1(int x){
        try{
            System.out.println("Protected code 1");
            if (x<2){
                throw new RuntimeException();
            }
            System.out.println("Protected code 2");
        }catch (Exception e){
            System.out.println("Catch");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Continuing on...");
    }

    public static void ex2(){
        try{                 // try-finally is okay
        } finally {
        }
    }
}
