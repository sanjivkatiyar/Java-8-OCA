package org.javaadvanced;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C53IntermediateOperationFlatMap {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Sean", "desmond");
        List<String> list2 = Arrays.asList("Marry", "Ann");
        Stream<List<String>> streamOfLists = Stream.of(list1, list2);

        streamOfLists.flatMap(list->list.stream()).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
