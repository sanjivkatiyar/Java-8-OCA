package org.javaadvanced;

import java.util.ArrayList;
import java.util.List;

public class C6PreGenerics {
    public static void main(String[] args) {
        // A raw collection can hold any type of objects (except primitive).
        List myList = new ArrayList();         // can't enforce a type
        myList.add("Fred");
        myList.add(new Book("Java", 22.0));
        double d = 10;
        // Double d1= 11;                      // compilation error
        myList.add(43);

        // String s = myList.get(0);           // compilation error // cast is required
                                               // because collection has objects
        String s = (String)myList.get(0);
        String s1 = (String)myList.get(1);     // class cast exception at runtime

        // Generics takes care of both ends, putting in and getting out.

        List<String> myList2 = new ArrayList<>();
        myList2.add("Fred");
        // myList2.add(new Book("Java", 22.0)); // compile time error
        String name = myList2.get(0); // no casting required.




    }
}
