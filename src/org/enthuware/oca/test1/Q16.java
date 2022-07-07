package org.enthuware.oca.test1;

public class Q16 {
    public static void testInts(Integer obj, int var) {
        //obj = var++;
        obj++;
        ++obj;
    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2);
    }

    public void test (int a, int b){

    }

    /*public int test (int a, int b){   // already defined
        return 1;
    }*/
}
