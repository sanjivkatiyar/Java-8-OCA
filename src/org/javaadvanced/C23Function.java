package org.javaadvanced;

import java.util.function.Function;

public class C23Function {

    // Function<T,R> is a functional interface i.e. one abstract method
    // R apply(T t)
    public static void main(String[] args) {
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Sanjiv"));
        System.out.println(""+apply("Sanjiv", str-> str.length()));
    }

    public static <T,R> R apply(T t, Function<T,R> function){
        return function.apply(t);
    }
}
