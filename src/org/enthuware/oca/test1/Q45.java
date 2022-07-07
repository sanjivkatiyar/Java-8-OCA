package org.enthuware.oca.test1;


    class Base1{
        public short getValue(){ return 1; } //1
    }
    class Base3 extends Base1{
        //public byte getValue(){ return 2; } //2     // incase of primitive overriding method must
        // have same return type
        // public Short getValue(){ return 2; } //2   // incompatible type
        public short getValue(){ return 2; } //2
    }
    public class Q45{
        public static void main(String[] args){
            Base1 b = new Base3();
            System.out.println(b.getValue()); //3
        }
    }

