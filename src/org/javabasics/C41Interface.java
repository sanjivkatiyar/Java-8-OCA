package org.javabasics;

public class C41Interface {
}

interface I{
    // All of following methods are legal and identical
    // void m();
    // public void m();
    // abstract void m();
    // public abstract void m();
    abstract public void m();
}

interface I1{
    // final void m();  // illegal combination final and abstract
}

interface I2{
    // all of below constants are legal and identical
    // int x=1;
    // public int x=1;
    // static int x=1;
    // public static int x=1;
    // public final int x=1;
    // static final int x=1;
    // public static final int x=1;
    final static public int x=1;
}