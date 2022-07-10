package org.enthuware.oca.test2;

public class Q28 {
    public static void main(String[] args) {
        System.out.println(Boolean.parseBoolean("true"));                    // primitive true
        System.out.println(Boolean.parseBoolean("true") == true);            // true
        System.out.println();
        System.out.println(Boolean.parseBoolean("TrUe"));                   // primitive true
        System.out.println(new Boolean(null));                              // object false
        System.out.println(Boolean.parseBoolean("TrUe") == new Boolean(null)); // unwrap and compare // false
        System.out.println();
        System.out.println(new Boolean("TrUe"));                            // true object
        System.out.println(new Boolean(true));                           // true object
        System.out.println(new Boolean("TrUe") == new Boolean(true));  // object object comparison // false
        //System.out.println(new Boolean() == false);
        // no param constructor is unavailable
        System.out.println();
        System.out.println(new Boolean("true"));                        // true object
        System.out.println(Boolean.TRUE);                                  // returns object
        System.out.println(new Boolean("true") == Boolean.TRUE);        // object object comparison // false
        System.out.println();
        System.out.println(new Boolean("no"));                          // false object
        System.out.println(new Boolean("no") == false);                 // object unwrapped and compares
    }
}
