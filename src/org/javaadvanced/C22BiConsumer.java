package org.javaadvanced;

import java.util.HashMap;
import java.util.function.BiConsumer;

// BiConsumer is a functional interface i.e one abstract method
// void accept(T t, U u)
public class C22BiConsumer {
    public static void main(String[] args) {
        var mapCapitals = new HashMap<String, String>();
        BiConsumer<String, String> biConsumer = (country, capital) -> mapCapitals.put(country,capital);
        biConsumer.accept("India", "New Delhi");
        System.out.println(mapCapitals);

        BiConsumer<String, String> mapPrint = (country, city) -> System.out.println("Capital of " + country + " is "+city);
        mapCapitals.forEach(mapPrint);
    }
}
