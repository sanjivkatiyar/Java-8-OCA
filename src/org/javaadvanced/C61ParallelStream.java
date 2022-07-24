package org.javaadvanced;

import java.util.stream.Stream;

public class C61ParallelStream {
    public static void main(String[] args) {
        int sum = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .parallel()
                .peek(System.out::println)
                .mapToInt(n->n)
                .sum();
        System.out.println(sum);


        int sum1 = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .peek(System.out::println)
                .mapToInt(n->n)
                .sum();
        System.out.println(sum1);


    }
}
