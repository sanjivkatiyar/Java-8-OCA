package org.linkedin;

public class C1 extends P1{

    public C1(String s) {
        super(s);                              // if remove this line - compilation error
        System.out.println("Child");
    }

    public static void main(String[] args) {
        new C1("temp");
    }
}

class P1
{
    public P1(String s){
        System.out.println("Parent");
    }
}

