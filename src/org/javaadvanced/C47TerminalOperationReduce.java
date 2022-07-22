package org.javaadvanced;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class C47TerminalOperationReduce {

    // T reduce (T identity BinaryOperator<T> accumulator)
    public static void main(String[] args) {
        String name = Stream.of("s", "a", "n", "j", "i", "v").reduce("", String::concat);
        System.out.println(name);

        Integer product = Stream.of(2,3,4).reduce(1,(a,b)->a*b);
        System.out.println(product);

        // 3 possible results
        // a) empty stream => empty operation returned
        // b) one element in stream => that element returned
        // c) multiple element in stream => accumulator applied

        BinaryOperator<Integer> op = (a,b) -> a+b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(6);
        Stream<Integer> multipleElement = Stream.of(3,4,5);
        Stream<Integer> multipleElement1 = Stream.of(3,4,5);
        Stream<Integer> multipleElement2 = Stream.of(3,4,5);
        empty.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println);
        multipleElement.reduce(op).ifPresent(System.out::println);
        System.out.println(multipleElement1.reduce(op));
        System.out.println(multipleElement2.reduce(1,op));

        // <U> U reduce(U identity, BiFunction accumulator,
        // BinaryOperator combiner)

        Stream<String> stream = Stream.of("car","bus","train","plane");
        int length = stream.reduce(0,
                (n, str)-> n + str.length(),
                (n1, n2)-> n1 + n2);
        System.out.println(length);

    }

}
