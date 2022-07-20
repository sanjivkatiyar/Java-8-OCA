package org.javaadvanced;

import java.util.stream.Stream;

public class C36StreamsAreLazy {
    public static void main(String[] args) {

        Stream.of("Sanjiv","Jyoti","Ishi", "Ishu","Shikha").filter(s->{
            System.out.println("Filter : " + s);
            return true;
        }).forEach(System.out::println);

        Stream.of("Sanjiv","Jyoti","Ishi", "Ishu","Shikha").filter(s->{
            System.out.println("Filter : " + s);
            return true;
        }).anyMatch(s->s.startsWith("J"));

        Stream.of("Sanjiv","Jyoti","Ishi", "Ishuu","Shikha")
                .peek(System.out::println)
                .filter(s->{
                    System.out.println("Filter1 : " + s);
                    return s.startsWith("I");})
                .filter(s->{
                    System.out.println("Filter2 : " + s);
                    return s.length() > 4;})
                .limit(1)
                .forEach(System.out::println);

    }



}
