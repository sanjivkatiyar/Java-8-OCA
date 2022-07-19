package org.javaadvanced;

import java.util.function.BinaryOperator;

public class C26BinaryOperator {
    public static void main(String[] args) {
        // BinaryOperator<T> extends BiFunction<T,T,T> is a functional interface i.e. one abstract method
        // T apply(T t1, T t2)

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1.concat(str2);
        System.out.println(binaryOperator.apply("Sanjiv", "Jyoti"));
        System.out.println(apply("Sanjiv", "Jyoti", String::concat));
    }

    public static <T> T apply(T t1, T t2, BinaryOperator<T> binaryOperator){
        return binaryOperator.apply(t1, t2);
    }
}
