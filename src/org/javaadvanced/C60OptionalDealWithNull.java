package org.javaadvanced;

import java.util.Optional;

public class C60OptionalDealWithNull {

    public static void main(String[] args) {
        Optional<String> sk = howToDealWithNull("SK");
        sk.ifPresent(System.out::println);
        Optional<String> optNull = howToDealWithNull(null);
        System.out.println(optNull.orElseGet(()->"Empty Optional"));
    }


    public static Optional<String> howToDealWithNull(String param){
        Optional optional = Optional.ofNullable(param);
        return optional;
    }
}
