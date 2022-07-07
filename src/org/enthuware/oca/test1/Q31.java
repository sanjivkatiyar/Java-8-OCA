package org.enthuware.oca.test1;

public class Q31 {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        //if (b2 != b1 = !b2){          // compilation error
        if (b2 = b1 = !b2){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
