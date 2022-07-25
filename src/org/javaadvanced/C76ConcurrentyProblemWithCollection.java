package org.javaadvanced;

import java.util.HashMap;
import java.util.Map;

public class C76ConcurrentyProblemWithCollection {

    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<>();
        capitalCities.put("New Delhi", "India");
        capitalCities.put("Washington DC", "USA");

        for(String key: capitalCities.keySet()){
            System.out.println(key + " is the capital of " + capitalCities.get(key));
            capitalCities.remove(key);
        }
    }
}
