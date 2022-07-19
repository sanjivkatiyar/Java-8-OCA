package org.javaadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C30MethodReference {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isEmpty;
        System.out.println(predicate.test("Sanjiv"));
        List<String> list = Arrays.asList("TT", "PP");
        list.forEach(System.out::println);
    }
}
