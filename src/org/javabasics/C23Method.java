package org.javabasics;

public class C23Method {
    public static void main(String[] args) {

        int sum = performCalc(3,4);
        System.out.println(sum);

        sum = performCalc(5,7);
        System.out.println(sum);
    }

    public static int performCalc(int x, int y){
        int sum = x+y;
        return sum;
    }
}
