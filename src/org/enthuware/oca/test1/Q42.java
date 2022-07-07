package org.enthuware.oca.test1;

public class Q42 {
    public static void main(String[] args) {
        Object t = new Integer(107);
        //int k = (Integer) t.intValue()/9;     // intValue() is not present in Object
        int k = ((Integer) t).intValue()/9;
        System.out.println(k);
    }
}
