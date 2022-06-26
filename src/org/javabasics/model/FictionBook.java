package org.javabasics.model;

import org.javabasics.C38Protected;

class FictionBook extends C38Protected {
    public void doThings(){
        read();                                             // different package vis inheritance  // no problem
        this.read();                                        // different package vis inheritance  // no problem
        FictionBook fb = new FictionBook();                 // different constructor create for us
        fb.read();                                          // no problem

        // Here, I create an instance of the superclass that has the protected member. Note that even though
        // FictionBook has access via inheritance to read(), FictionBook must access it properly
        C38Protected book = new C38Protected();
        // book.read();                                     // compilation error
    }
}

class SpaceFictionBook extends FictionBook{
    public void doThings(){
        read();                                             // different package vis inheritance  // no problem
        new SpaceFictionBook().read();                      // OK
        // new C38Protected().read();                       // compilation error
        // new FictionBook().read();                        // compilation error
    }
}

class Reader{
    public void doThings(){
        C38Protected book = new C38Protected();
        // book.read();                                     // compilation error

        FictionBook fb = new FictionBook();
        // fb.read();                                       // compilation error
    }
}