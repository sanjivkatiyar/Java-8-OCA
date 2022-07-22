package org.javaadvanced;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C48TerminalOperationCollect {

    // StringBuilder collect(Supplier<StringBuilder> supplier,
    // BiConsumer<StringBuilder, String> accumulator,
    // BiConsumer<StringBuilder, StringBuilder> combiner)
    public static void main(String[] args) {

        StringBuilder word = Stream.of("a","b", "c", "d")
                .collect(() -> new StringBuilder(),
                        (sb,str)->sb.append(str),
                        (sb1,sb2)->sb1.append(sb2));
        System.out.println(word);

        String s = Stream.of("cake", "biscuits", "apple tart")
                .collect(Collectors.joining(","));
        System.out.println(s);

        Double avg = Stream.of("cake", "biscuits", "apple tart")
                .collect(Collectors.averagingInt(t->t.length()));
        System.out.println(avg);

        Map<String, Integer> map = Stream.of("cake", "biscuits", "apple tart")
                .collect(Collectors.toMap(
                        r->r,
                        r->r.length()
                ));
        System.out.println(map);

        Map<Integer, String> map1 =
                Stream.of("cake", "biscuits", "tart")
                        .collect(Collectors.toMap(
                                u-> u.length(),
                                u->u,
                                (u1, u2) -> u1+","+u2 //pass merge function to avoid illegal state exception due to duplicate keu
                        ));
        System.out.println(map1);

        TreeMap<String,Integer> treeMap =
                Stream.of("cake", "biscuits", "tart", "cake")
                        .collect(Collectors.toMap(
                                v->v,
                                v->v.length(),
                                (l1,l2) -> l1+l2,
                                () -> new TreeMap<>()
                        ));

        Stream<String> names = Stream.of("cake", "biscuits", "tart", "cake");
        Map<Integer, List<String>> mapp =
                names.collect(Collectors.groupingBy(String::length));
        System.out.println(mapp);

        // removing duplicate use set
        Stream<String> namess = Stream.of("cake", "biscuits", "tart", "cake");
        Map<Integer, Set<String>> mappp =
                namess.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(mappp);

        Stream<String> nameOfBoys = Stream.of("Joe", "Tom", "Tom", "Alan", "Peter");
        TreeMap<Integer, List<String>> nameMap = nameOfBoys.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()
                ));
        System.out.println(nameMap);

        // special case of true and false
        Stream<String> nameOfAdults = Stream.of("Tom", "Teresa", "Mike", "Alan", "Peter");
        Map<Boolean, List<String>> mapOfAdults =
                nameOfAdults.collect(Collectors.partitioningBy(v->v.startsWith("T")));
        System.out.println(mapOfAdults);
    }
}
