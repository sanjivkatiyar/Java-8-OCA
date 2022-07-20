package org.javaadvanced;

import java.util.stream.Stream;

public class C41InfiniteStream {
    static int count;
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.generate(()-> {
            System.out.println("Count: " + ++count);
            return (int)(Math.random()*10);
        });
        integerStream.forEach(System.out::println);

        Stream<Integer> integerStream1 = Stream.iterate(2, n-> n+2);
        integerStream1.forEach(System.out::println);
    }
}
