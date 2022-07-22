package org.javaadvanced;

import java.util.stream.Stream;

public class C50IntermediateOperationDistinct {
    public static void main(String[] args) {
        Stream.of("eagle", "eagle", "EAGLE")
                .peek(s-> System.out.println(" 1. " + s))
                .distinct()
                .forEach(s -> System.out.println(" 2. " + s));
    }
}
