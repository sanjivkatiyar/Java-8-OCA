package org.javaadvanced;

import java.util.stream.Stream;

public class C52IntermediateOperationMap {
    public static void main(String[] args) {

        // <R> Stream<R> map(Function<T,R> mapper)
        Stream.of("Book", "Pen", "Ruler")
                .map(s -> s.length())
                .forEach(System.out::println);
    }
}
