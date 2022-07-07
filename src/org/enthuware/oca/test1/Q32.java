package org.enthuware.oca.test1;

public class Q32 extends San {
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(sayHello());
    }
}

class San {
   static String name = "sanjiv";
   static String sayHello(){
       return "Hello";
   }
}
