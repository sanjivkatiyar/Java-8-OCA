package org.javaadvanced;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class C38StreamofCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sanjiv", "Jyoti", "Ishi", "Ishu");
        Stream<String> stream = list.stream();
        System.out.println(stream.count());

        Map<String, Integer> map = new HashMap<>();
        map.put("Sanjiv", 40);
        map.put("Jyoti", 39);
        map.put("Ishi", 7);
        map.put("Shreyas", 7);

        map.entrySet().forEach(System.out::println);
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println(map.size());

        System.out.println(map.entrySet().stream().filter(s->s.getValue()>7).count());
    }

}
