package org.javaadvanced;

import java.util.Optional;
import java.util.stream.Stream;

// Optional<T> findAny()
// Optional<T> findFirst()

public class C44TerminalOperatorsFindAnyFindFirst {
    public static void main(String[] args) {
        Optional<String> any = Stream.of("John", "Paul").findAny();
        any.ifPresent(System.out::println);

        Optional<String> first = Stream.of("John", "Paul").findFirst();

        first.ifPresent(System.out::println);
    }
}
