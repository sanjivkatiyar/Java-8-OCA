package org.javabasics;

import java.io.EOFException;

public class C51TryCatch {
    public static void main(String[] args) {
        try{
            spillTea();
            System.out.println("Will never get here!");
        } catch (RuntimeException e){
            getAnotherCup();
        }
        enjoyRestOfVideo();
        trycatchExample1();
    }
    public static void spillTea(){
        System.out.println("Spilling tea.... ");
        throw new RuntimeException();
    }
    public static void getAnotherCup(){
        System.out.println("Getting another cup");
    }
    public static void enjoyRestOfVideo(){
        System.out.println("Enjoying rest of the video.... ");
    }
    public static void trycatchExample1(){
        /*try{

        }catch(EOFException e){
            // All the checked exception caught must be thrown from try block
            // or a subclass must be thrown
        }*/

        try {

        } catch(RuntimeException e){
            // this is okay because of unchecked exception
        }
    }
    public static void tryCatchExample2(){
        try{
            ex1();
        } catch (EOFException e){}
    }
    public static void ex1() throws EOFException{
        // This method does not actually throw any exception at all.
        // Regardless, the compiler ensures however that caller has to catch
        // or throw EOFException
    }
}
