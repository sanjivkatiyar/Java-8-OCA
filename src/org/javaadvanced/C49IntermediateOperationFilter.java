package org.javaadvanced;

import java.util.stream.Stream;

public class C49IntermediateOperationFilter {

    public static void main(String[] args) {
        // Stream <T> filter(Predicate)
        Stream.of("galway", "mayo", "roscommon")
                .filter(name->name.length()>5)
                .forEach(System.out::println);
    }
}
