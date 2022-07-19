package org.javaadvanced;

import java.util.function.UnaryOperator;

public class C25UnaryOperator {
    // UnaryOperator extends Function<T, T> is a functional interface i.e. one abstract method
    // T apply <T t>
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = str -> str + str;
        System.out.println(unaryOperator.apply("Sanjiv"));
        System.out.println(apply("Ishi", str -> str+str));
        System.out.println(apply(4, num -> num + num));
    }

    public static <T> T apply(T t, UnaryOperator<T> unaryOperator){
        return unaryOperator.apply(t);
    }
}
