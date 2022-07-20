package org.javaadvanced;

import java.util.Locale;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class C31BoundMethodReference {

    public static void main(String[] args) {
        String name = "Sanjiv Katiyar";

        Supplier<String> supplier = () -> name.toUpperCase();
        Supplier<String> supplier1 = name::toUpperCase;

        System.out.println(supplier.get());
        System.out.println(supplier1.get());

        Predicate<String> predicate = (str)-> name.startsWith(str);
        Predicate<String> predicate1 = name::startsWith;

        System.out.println(predicate.test("Sanjiv"));
        System.out.println(predicate1.test("Sanjiv"));

    }
}
