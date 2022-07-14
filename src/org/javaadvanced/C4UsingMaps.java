package org.javaadvanced;

import java.util.Map;
import java.util.TreeMap;

public class C4UsingMaps {
    public static void main(String[] args) {
        treeMap();
    }
    // sorted by key or custom comparator
    public static void treeMap(){
        Map<String, Integer> map = new TreeMap<>();
        map.put("John", 18);
        map.put("Mary", 21);
        map.put("Chris", 33);

        System.out.println(map.containsKey("John"));
        System.out.println(map.containsValue(18));
        System.out.println(map.isEmpty());
        System.out.println(map.get("John"));
        System.out.println(map);
        map.forEach((name, age) -> {
            System.out.println(name);
            System.out.println(age);
        });
        System.out.println(map.size());
        map.clear();
        System.out.println(map);

        map.put("John", 18);
        map.put("Mary", 21);
        map.put("Chris", 33);

        map.entrySet().forEach(System.out::println);
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);

        map.put("Mike", null);
        System.out.println(map);
        map.putIfAbsent("Chris", 99);
        System.out.println(map);
        map.putIfAbsent("Mike", 55);
        System.out.println(map);
        map.putIfAbsent("Luke", 31);
        System.out.println(map);
        System.out.println(map.replace("Chris", 81));
        System.out.println(map);
        map.replaceAll((name, age)->name.length());
        System.out.println(map);
        map.remove("Mike");
        System.out.println(map);


    }
}
