package org.enthuware.oca.test1;

public class Q2{
    public static void main(String args[]){
        char c;
        int i;
        c = 'a';//1
        i = c;  //2
        i++;    //3
        // c = i;  //4    will throw compile time error
        c++;    //5
    }
}