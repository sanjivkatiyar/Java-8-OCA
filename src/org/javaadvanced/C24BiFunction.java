package org.javaadvanced;

import java.util.function.BiFunction;

// Bifunction<T, U, R> is a functional interface i.e. one abstract method:
// R apply(T t, U u)
public class C24BiFunction {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (str1,str2) -> str1.length() + str2.length();
        System.out.println(biFunction.apply("Sanjiv", "Ishu"));
        System.out.println("" +apply("Ishi", "Jyoti", (str1,str2) -> str1.length() + str2.length()));
    }

    public static <T, U, R> R apply(T t, U u, BiFunction<T, U, R> biFunction){
        return biFunction.apply(t, u);
    }
}
