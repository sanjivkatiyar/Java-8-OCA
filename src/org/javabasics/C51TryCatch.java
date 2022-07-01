package org.javabasics;

public class C51TryCatch {
    public static void main(String[] args) {
        try{
            spillTea();
            System.out.println("Will never get here!");
        } catch (RuntimeException e){
            getAnotherCup();
        }
        enjoyRestOfVideo();
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
}
