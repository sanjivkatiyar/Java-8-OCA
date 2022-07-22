package org.javaadvanced;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

//Optional<T> min(Comparator)
//Optional<T> max(Comparator)

public class C43TerminalOperationsCountMinMax {
    public static void main(String[] args) {
        long count = Stream.of("dog","Cat").count();
        System.out.println(count);

        Optional<String> min = Stream.of("deer", "horse", "pig").min((s1,s2)->s1.length()-s2.length());
        min.ifPresent(System.out::println);

        Comparator<String> comparator = (s1, s2) -> s1.length()-s2.length();

        Optional<Integer> max = Stream.of(4,6,2,12,9).max((i1,i2)->i1-i2);
        max.ifPresent(System.out::println);
    }
}
