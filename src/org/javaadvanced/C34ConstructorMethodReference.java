package org.javaadvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class C34ConstructorMethodReference {
    public static void main(String[] args) {
        Supplier<StringBuilder> supplier = ()->new StringBuilder();
        Supplier<StringBuilder> supplier1 = StringBuilder::new;
        StringBuilder sb = supplier1.get().append("SK");
        System.out.println(sb);

        Function<Integer, List<String>> function = ArrayList::new;
        Function<Integer, List<String>> function1 = x->new ArrayList<>(x);
        List<String> list = function.apply(10);
        list.add("Sanjiv");
        System.out.println(list);

    }
}
