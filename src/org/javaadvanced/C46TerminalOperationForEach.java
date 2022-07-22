package org.javaadvanced;

import java.util.stream.Stream;

//void forEach(Consumer)
public class C46TerminalOperationForEach {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Cathy","Pauline","Zoe");
        names.forEach(System.out::println);

        //for(String s:names)             // compilation error required array or iterable
    }

}
