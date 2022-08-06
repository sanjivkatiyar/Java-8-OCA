package org.linkedin;

public class C4 extends B4 {
    public static void Task(){
        System.out.println("Child");
    }
    public static void main(String[] args) {
        B4 b = new C4();
        b.Task();                  // method hiding same as B4.Task()
    }
}

class B4{
    public static void Task(){
        System.out.println("Base");
    }
}