package org.javaadvanced;

import java.util.Locale;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C57MappingObjectStreams {
    public static void main(String[] args) {
        Stream.of("Sanjiv","Jyoti","Ishi","Shreyas")
                .map(tree -> tree.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);

        DoubleStream doubleStream = Stream.of("Sanjiv","Jyoti","Ishi","Shreyas")
                .mapToDouble(String::length);
        doubleStream.forEach(System.out::println);

        IntStream intStream = Stream.of("Sanjiv","Jyoti","Ishi","Shreyas")
                .mapToInt(String::length);
        intStream.forEach(System.out::println);

        LongStream longStream = Stream.of("Sanjiv","Jyoti","Ishi","Shreyas")
                .mapToLong(String::length);
        longStream.forEach(System.out::println);
    }
}
