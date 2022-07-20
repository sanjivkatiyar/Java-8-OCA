package org.javaadvanced;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class C33StaticMethodReference {
    //static method reference are considered unbound
    public static void main(String[] args) {
        Consumer<List<Integer>> consumer = list -> Collections.sort(list);
        Consumer<List<Integer>> consumer1 = Collections::sort;

        List<Integer> list = Arrays.asList(1,3,7,5,3);
        consumer.accept(list);

        System.out.println(list);
    }
}
