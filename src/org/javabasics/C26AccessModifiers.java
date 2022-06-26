package org.javabasics;

public class C26AccessModifiers {
    public static void main(String[] args) {
        Adult john = new Adult("John", 22);
        john.setName("JJ");;
        john.badPractice = "BadPractice";
        //john.age = 10; // not ok
        System.out.println("Is 17 ok? "+john.isAgeOk(17));
        System.out.println("BadPractice "+john.badPractice);
    }
}

