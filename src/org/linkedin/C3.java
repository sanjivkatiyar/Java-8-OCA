package org.linkedin;

public class C3 {
    //final int val;              // compilation error val might have not been initialized
    //final String take;          // compilation error take might have not been initialized

    static int kk;                // non final are okay and initialized jvm

    // if final... can not be initialized to default by JVM
    public static void main(String[] args) {
        final int val;
        val = 3;
        // val = 4;              // variable already assigned, can be assigned only once
        System.out.println(val);

        final String take;
        // System.out.println(take);     // compilation error String is not initialized
        System.out.println(kk);
        System.out.println(C3.kk);
    }
}
