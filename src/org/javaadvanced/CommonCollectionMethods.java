package org.javaadvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CommonCollectionMethods {
    public static void main(String[] args) {
        // List allows duplicate
        Collection<String> col = new ArrayList<>();

        col.add("Lucy");
        col.add("April");
        col.add("Lucy");
        System.out.println(col);
        System.out.println(col.remove("Lucy"));
        System.out.println(col);
        System.out.println(col.isEmpty());
        System.out.println(col.size());
        System.out.println(col.contains("John"));
        System.out.println(col.contains("Lucy"));
        //boolean removeIf(Predicate<? super E> filter)
        System.out.println(col.removeIf(s->s.startsWith("A")));
        col.forEach(name -> System.out.println(name));
        col.clear();
        col.forEach(System.out::println);

        // asList() returns unmodifiable collection
        // add() will throw an unsupported exception
        Collection<String> col1 = Arrays.asList("Lucy", "April", "Lucy");
        col1.add("Tracy");                      // UnsupportedOperationException runtime
    }
}
