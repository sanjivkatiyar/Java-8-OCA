package org.enthuware.oca.test2;

public class Q14 {
    public static void main(String[] args) {
        int x = 0;
        // while (false) { x=3; }                 // unreachable

        if (false) { x=3; }                       // unreachable but exception

        // for( int i = 0; false; i++) {x = 3;}  // unreachable

        do{ x = 3; } while(false);


        for( int i = 0; i< 0; i++) {
            System.out.println("Test");
            x = 3;
        }

    }

}
