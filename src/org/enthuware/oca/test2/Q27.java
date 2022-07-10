package org.enthuware.oca.test2;

public class Q27 {
    public static void main(String[] args) {
        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);
    }

    // s = s + s + mx(s) + ++s;
    // s = 5 + 5 + mx(5) + 6;
    // s = 5 + 5+ 8 + 6; s = 24;
    static int mx(int s) {
        for (int i = 0; i < 3; i++) {
            s = s + i;
        }
        return s;
    }
}
