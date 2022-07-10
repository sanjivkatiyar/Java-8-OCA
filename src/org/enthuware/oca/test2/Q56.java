package org.enthuware.oca.test2;


class AAA{
    AAA() {  print();   }                               // print is polymorphic in nature
    void print() { System.out.print("A "); }             // even if being called from construct instance method will be called
}
class Q56 extends AAA{
    int i =   4;
    public static void main(String[] args){
        AAA a = new Q56();
        a.print();
    }
    void print() { System.out.print(i+" "); }
}