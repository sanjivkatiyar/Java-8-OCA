package org.javaadvanced;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C55PrimitiveStreams {

    public static void main(String[] args) {
        int[] ia = {1,2,3};
        double[] da = {1.1, 2.2, 3.3};
        long[] la = {1L, 2L, 3L};

        IntStream intStream = Arrays.stream(ia);
        DoubleStream doubleStream = Arrays.stream(da);
        LongStream longStream = Arrays.stream(la);
        System.out.println(intStream.count() +","+ doubleStream.count() + longStream.count());

        IntStream intStream1 = IntStream.of(1,2,3);
        DoubleStream doubleStream2 = DoubleStream.of(da);
        LongStream longStream3 = LongStream.of(la);
        System.out.println(intStream1.count() +","+ doubleStream2.count() + longStream3.count());

        Stream<Integer> numbers = Stream.of(1,2,3);
        System.out.println(numbers.reduce(0, (a,b)-> a+b));

        IntStream intStream2 = Stream.of(1,2,3).mapToInt(n->n); //unboxing
        int total = intStream2.sum();
        System.out.println(total);

        OptionalInt max = IntStream.of(10,20,30).max();
        max.ifPresent(System.out::println);

        OptionalDouble min = DoubleStream.of(10.0, 20.0, 30.0).min();
        System.out.println(min.orElseThrow());

        OptionalDouble average = LongStream.of(10L, 20L, 30L).average();
        System.out.println(average.orElseGet(Math::random));
    }
}
