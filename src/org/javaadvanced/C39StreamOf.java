package org.javaadvanced;

import java.util.stream.Stream;

public class C39StreamOf {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(3,5,4,6,1);
        System.out.println(integerStream.filter(num->num>3).count());

        Stream<String> stringStream = Stream.of("AA","CC", "BB");
        System.out.println(stringStream.count());

        Stream<Dog> dogStream = Stream.of(new Dog());
        System.out.println(dogStream.count());
    }
}
