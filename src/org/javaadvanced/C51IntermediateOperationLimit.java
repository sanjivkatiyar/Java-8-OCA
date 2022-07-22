package org.javaadvanced;

import java.util.stream.Stream;

public class C51IntermediateOperationLimit {
    public static void main(String[] args) {

        // Stream<T> limit(long maxSize)

        Stream.of(11,22,33,44,55,66,77,88,99)
                .peek(n-> System.out.println(" A - " + n))
                .filter(n -> n>40)
                .peek(n-> System.out.println(" B - " + n))
                .limit(2)
                .forEach(n-> System.out.println(" C - " + n));
    }
}
