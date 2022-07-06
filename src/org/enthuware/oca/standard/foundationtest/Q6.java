package org.enthuware.oca.standard.foundationtest;

public class Q6 {
    static char c;
    static int i;
    static byte b;
    static float f;
    static short s;
    static long l;
    public static void main(String[] args) {
        l = c;        // char to long
        s = b;
        // c = s;        // short to char or char to short require cast as their range do not match
        // c = b;       // byte to char or char to byte require cost
        // b = s;        // not okay,
        // final value is okay


        f = i;


        //short
        s = b;

        //int
        i = b;
        i = c;
        i = s;

        // long
        l = b;
        l = c;
        l = s;
        l = i;

        //floats
        f = b;
        f = c;
        f = s;
        f = i;
        f = l;
        f=8;
        f=8f;


        final short fs = 10;
        b = fs;
        c = fs;




    }
}
