package org.javaadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;

public class C35StreamPipeline {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(2.5,4.6,2.3,100.45, 103.0,56.8, 88.0);
        System.out.println("Count of numbers greater than 100 : " +
                list.stream().peek(System.out::println).filter(num->num>100).peek(System.out::println).count());
    }
}
