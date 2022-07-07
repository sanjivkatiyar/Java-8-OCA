package org.enthuware.oca.test1;

// getClass is a public instance method in Object class.
// That means it is polymorphic. In other words,
// this method is bound at run time and so
// it returns the name of the class of the actual object to which the reference points.
// Here, at run time, both - a and aa, point to an object of class AA. So both will print AA.
class A {
}

class AA extends A {
}


public class Q40 {
    public static void main(String[] args) throws Exception {
        A a = new A();
        AA aa = new AA();
        a = aa;
        System.out.println("a = "+a.getClass());
        System.out.println("aa = "+aa.getClass());
    }
}
