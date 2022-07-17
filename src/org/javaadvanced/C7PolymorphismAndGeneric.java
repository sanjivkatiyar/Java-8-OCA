package org.javaadvanced;

import java.util.ArrayList;
import java.util.List;

public class C7PolymorphismAndGeneric {
    public static void main(String[] args) {
        // This issue
        List<Double> doubles = new ArrayList<>();
        doubles.add(12.0);
        // List<Object> objects = doubles;            // compiler error

        // List<Number> numbers = new ArrayList<Integer>();   // compilation error
    }
}
