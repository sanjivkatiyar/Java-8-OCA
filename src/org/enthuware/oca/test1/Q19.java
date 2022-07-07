package org.enthuware.oca.test1;

import org.enthuware.oca.test1.sub.A;

public class Q19  extends A {
    Q19() {
        super();
    }

    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new Q19();
    }
}
