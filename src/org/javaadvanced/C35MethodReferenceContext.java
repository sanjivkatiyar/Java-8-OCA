package org.javaadvanced;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class C35MethodReferenceContext {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> Person.howMany();
        Supplier<Integer> supplier1 = Person::howMany;

        System.out.println(supplier.get());
        System.out.println(supplier1.get());

        Function<Person, Integer> function = person -> Person.howMany(person);
        Function<Person, Integer> function1 = Person::howMany;

        System.out.println(function.apply(new Person()));
        System.out.println(function1.apply(new Person()));

        BiFunction<Person, Person, Integer> biFunction = (person1, person2) -> Person.howMany(person1, person2);
        BiFunction<Person, Person, Integer> biFunction1 = Person::howMany;

        System.out.println(biFunction.apply(new Person(), new Person()));
        System.out.println(biFunction1.apply(new Person(), new Person()));
    }
}

class Person{
    public static Integer howMany(Person... people){
        return people.length;
    }
}
