package org.enthuware.oca.test3;

public class Q12 {
    public static void main(String[] args) {
        int INT1 = 2;
        int INT2 = 4;
        for (int i = INT1; i < INT2; i++) {
            System.out.println(i);
        }
        for (int i = INT1; i < INT2; System.out.println(++i)) ;  // ok loop


        for(int i=INT1; i++<INT2; System.out.println(i)); // okay loop

        int i=INT1; while(i++<INT2) { System.out.println(i); }

        i=INT1; do { System.out.println(i); }while(i++<INT2);
    }
}
