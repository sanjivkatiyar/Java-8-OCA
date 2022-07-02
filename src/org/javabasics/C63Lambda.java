package org.javabasics;

public class C63Lambda {

    public static void main(String[] args) {
        InFa i = new InFa() {
            @Override
            public void m() {
                System.out.println("InFa:m()");
            }
        };
        i.m();                  // I::m()

        // Java 8 - Lambda expression
        InFa inFa = () -> {
            System.out.println("Lambda Version");
        };

        InFa inFa1 = () -> System.out.println("Lambda Version");

        inFa.m();
        inFa1.m();
    }
}

interface InFa{
    void m();      // a functional interface, only one method
}
