package org.javaadvanced;

import java.util.Comparator;
import java.util.stream.Stream;

public class C54IntermediateOperationSorted {
    // Stream<T> sorted(Comparator<T> comparator)

    public static void main(String[] args) {
        Child child1 = new Child("Shreyas", 8);
        Child child2 = new Child("Ishi", 7);
        Stream.of(child1, child2)
                .sorted(Comparator.comparing(Child::getAge))
                .forEach(System.out::println);
    }

}

class Child{
    private String name;
    private int age;

    public Child(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Child{name="+name+", age="+age+"}";
    }
}
