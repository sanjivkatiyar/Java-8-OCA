package org.javaadvanced;

import java.util.Arrays;
import java.util.stream.Stream;

public class C37StreamOfArray {

    public static void main(String[] args) {
        Double[] numbers = {1.1, 2.2, 3.3};

        Stream<Double> stream = Arrays.stream(numbers);
        long count = stream.count();
        System.out.println(count);
    }

}
