package org.javaadvanced;

import java.util.Set;
import java.util.TreeSet;

// SUU - sets are unique and un-ordered
public class C3UsingSets {
    public static void main(String[] args) {
        factoryMethods();
    }

    public static void factoryMethods(){
        // un-modifiable sets returned
        Set<String> of = Set.of("San", "Man", "Tan");
        Set<String> copy = Set.copyOf(of);
        of.remove("Dan");                             // Unsupported operation exception
        of.add("Dan");                                   // Unsupported operation exception
        copy.add("Dan");                                 // Unsupported operation exception
    }

    public static void treeSet(){
        Set<String> names = new TreeSet<>();
        names.add("John");
        names.add("John");
        names.add("Helen");
        names.add("Anne");
    }

}
