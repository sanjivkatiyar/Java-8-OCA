package org.javaadvanced;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class C32UnboundMethodReferences {
    public static void main(String[] args) {
        Function<String, String> function = s -> s.toUpperCase();
        Function<String, String> function1 = String::toUpperCase;

        System.out.println(function.apply("Sanjiv"));
        System.out.println(function1.apply("Jyoti"));

        BiFunction<String, String, String> biFunction = (s,t) -> s.concat(t);
        BiFunction<String, String, String> biFunction1 = String::concat;

        System.out.println(biFunction.apply("sanjiv", "Jyoti"));
        System.out.println(biFunction1.apply("sanjiv", "Jyoti"));
    }
}
