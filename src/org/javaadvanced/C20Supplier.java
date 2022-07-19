package org.javaadvanced;

import java.time.LocalTime;
import java.util.Map;
import java.util.function.Supplier;

public class C20Supplier {
    // Supplier is a functional interface i.e one abstract method
    // T get()
    public static void main(String[] args) {
        Supplier<StringBuilder> subSB = () -> new StringBuilder();
        System.out.println("Supplier SB :" + subSB.get().append("SK"));

        Supplier<LocalTime> supT = () -> LocalTime.now();
        System.out.println(supT.get());

        Supplier<Double> supD = Math::random;
        System.out.println(supD.get());
    }
}
