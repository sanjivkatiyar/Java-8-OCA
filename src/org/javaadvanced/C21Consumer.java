package org.javaadvanced;

import java.util.function.Consumer;

// Consumer is a functional interface i.e.one abstract method
// void accept(T t)
public class C21Consumer {
    public static void main(String[] args) {
        Consumer<String> consumer = s-> System.out.println(s);
        consumer.accept("Sanjiv");
        take("Ishi", str-> System.out.println(str));

    }

    public static <T> void take(T t, Consumer<T> consumer){
        consumer.accept(t);
    }
}
