package org.enthuware.oca.test1;
//Trying to override a static method with a non-static method (and vice-versa)
// in a class will result in a compilation error. Even in case of interfaces,
// a subinterface cannot override a default method with a static method.

// You can, however, have a default method in a subinterface with the same signature
// as a static method of its super interface because a static method of an interface
// can only be called using that interface's name.

// An interface can redeclare a default method and provide a different implementation.

// 1. static methods can never be abstract (neither in an interface nor in a class).
// 2. An interface can have a static method but the method must have a body.
// A default method must have a body.
interface Account {
    public default String getId(){
        return "0000";
    }
}

interface PremiumAccount extends Account {
    public String getId();

    /*public static String getId() {
        return "0000";
    }*/
}