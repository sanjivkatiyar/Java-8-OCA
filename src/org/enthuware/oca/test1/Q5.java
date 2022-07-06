package org.enthuware.oca.test1;

public class Q5 {
    public static void main(String[] args) {
        String mStr = "123";
        System.out.println(new Long(mStr));
        System.out.println(Long.parseLong(mStr));
        System.out.println(Long.valueOf(mStr));
        System.out.println(Long.valueOf(mStr).longValue());
        // Long.longValue(mStr);
        // (new Long()).parseLong(mStr);
    }
}
