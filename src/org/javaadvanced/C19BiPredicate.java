package org.javaadvanced;

import java.util.function.BiPredicate;

// BiPredicate<T,U> is a functional interface i.e. one abstract method
// boolean test(T t, U u)
public class C19BiPredicate {
    public static void main(String[] args) {
        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Sanjiv",6));
        System.out.println(check("Ishi", 4, (str,len)-> str.length() == len));
    }

    public static <T,U> boolean check(T t, U u, BiPredicate<T, U> biPredicate){
        return biPredicate.test(t, u);
    }
}
