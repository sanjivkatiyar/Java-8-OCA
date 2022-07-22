package org.javaadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class C42TerminalOperations {
    public static void main(String[] args) {
        Optional<String> any = Stream.of("John", "Paul").findAny();
        any.ifPresent(System.out::println);

        Optional<String> first = Stream.of("John", "Paul").findFirst();
        first.ifPresent(System.out::println);

        Stream.of("Sanjiv", "Jyoti", "Ishi", "Shreyas").forEach(System.out::println);

        List<String> namesq = Arrays.asList("Sanjiv","Jyotu");
        namesq.stream().forEach(System.out::print);

        Stream<String> names = Stream.of("Sanjiv", "Jyoti", "Ishi", "Shreyas");
        Predicate<String> predicate = name->name.startsWith("S");
        System.out.println(names.anyMatch(predicate));
        //System.out.println(names.allMatch(predicate));                          //stream has already been operated upon or closed
        //System.out.println(names.noneMatch(predicate));

        Stream<Integer> intStream = Stream.of(1);
//        for(Integer i:intStream){                                             // compilation error steams are not iterable
//
//        }

        System.out.println(Stream.of("a","b","c")
                .reduce("", (s,c)-> s+c));

        System.out.println(Stream.of(2,3,4)
                .reduce(1, (s,c)-> s*c));

        // 3 possible results of re
    }
}
