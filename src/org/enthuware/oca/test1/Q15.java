package org.enthuware.oca.test1;

public class Q15 {
    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
            str.concat(str+" "+ind);
            ind++;
        }
    }
    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Q15 ot = new Q15();
        String[] arr = new String[2];    // array of strings with null values in it
        ot.initData(arr);
        ot.printData(arr);
    }
}
