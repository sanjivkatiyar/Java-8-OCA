package org.enthuware.oca.standard.foundationtest;

public class Q3 {
    public static void main(String[] args) {
        if(true); else;                      // legal
        // if (true) else;                   // illegal else without if
        if(true) if(false);               // legal
    }
}
