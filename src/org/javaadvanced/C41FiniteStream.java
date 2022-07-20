package org.javaadvanced;

import java.util.stream.Stream;

public class C41FiniteStream {
    static int i=1;
    public static void main(String[] args) {
       generateTableOf(11);
    }

    public static void generateTableOf(int n){
        Stream<Integer> integerStream = Stream.iterate(n, x->n*i++)
        .limit(11);
        i=0;
        integerStream.forEach(num->{
            System.out.println(n+"*"+i+"="+num);
        });

    }
}
