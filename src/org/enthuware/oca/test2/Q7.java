package org.enthuware.oca.test2;

// Note that when a method returns objects (as opposed to primitives, like in this question),
// the principle of covariant returns applies. Meaning, the overriding method is allowed to return
// a subclass of the return type defined in the overridden method. Thus, if a base class's method is:
// public A m(); then a subclass is free to override it with: public A1 m(); if A1 extends A.
class A{
    public double m1(int a){
        return a*10/4-30;
    }
}
public class Q7 extends A{
    public double m1(int a){
        return a*10/4.0;
    }
}
