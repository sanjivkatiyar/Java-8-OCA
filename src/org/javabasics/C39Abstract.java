package org.javabasics;

public class C39Abstract {
    public static void main(String[] args) {
        // Pen pen = new Pen();            // can not use "new" as Pen is abstract
        Pencil pencil = new DrawingPencil();
        pencil.write();
        // pencil.erage();                 // pencil reference can only access methods of DrawingPencil
                                           // if defined in Pencil class.
        DrawingPencil dp = (DrawingPencil) pencil;
        dp.erage();                        // can do cast to get access
    }
}

abstract class Pen {}                      // no abstract method

// class Pencil{                           // a class with abstract methods must be abstract
abstract class Pencil{
    // abstract void write(){}             // no brackets
    abstract void write();
}

class DrawingPencil extends Pencil{
    @Override
    void write(){}
    void erage(){}
}