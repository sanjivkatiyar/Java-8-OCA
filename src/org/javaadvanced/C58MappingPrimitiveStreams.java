package org.javaadvanced;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C58MappingPrimitiveStreams {
    public static void main(String[] args) {
        Stream<String> streamAges = IntStream.of(1,2,3)
                .mapToObj(n->"number:"+n);
        streamAges.forEach(System.out::println);

        DoubleStream doubleStream = IntStream.of(1,2,3)
                .mapToDouble(n->n);
        doubleStream.forEach(System.out::println);

        IntStream.of(1,2,3)
                .map(n->n*2)
                .forEach(System.out::println);
    }
}
