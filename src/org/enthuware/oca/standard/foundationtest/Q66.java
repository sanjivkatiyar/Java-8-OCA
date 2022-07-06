package org.enthuware.oca.standard.foundationtest;

public class Q66 {
    public static void main(String[] args) {
        int i = 1234567890;
        float f = i;
        System.out.println(f);
        System.out.println((int)f);
        System.out.println(i - (int)f); /// dont uderstant but will not print 0
    }
}
