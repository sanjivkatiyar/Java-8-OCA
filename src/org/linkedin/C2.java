package org.linkedin;

public class C2 {

    public static void getInfo(int val){
        System.out.println("integer");
    }

    public static void getInfo(long val){
        System.out.println("long");
    }

    public static void main(String[] args) {
        getInfo(99999999L);
    }
}
