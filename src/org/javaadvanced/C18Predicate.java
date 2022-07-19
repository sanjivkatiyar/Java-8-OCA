package org.javaadvanced;

import java.util.function.Predicate;


// package function
// Predicate<T> is a functional interface i.e. one abstract method
// boolean test(T t);
public class C18Predicate {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.contains("City");
        System.out.println(predicate.test("VeticanCity"));
        System.out.println(check(9, i->i%2==0));
    }

    public static <T> boolean check(T t, Predicate<T> predicate){
        return predicate.test(t);
    }
}
