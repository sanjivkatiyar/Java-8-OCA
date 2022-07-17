package org.javaadvanced;

import java.util.ArrayList;
import java.util.List;

public class C8UnboundedWildcard {
    public static void main(String[] args) {
        List<String> names =  new ArrayList<>();
        names.add("Sanjiv");
        // showBoundedList(names);        // compile time error and no polymorphism in generics
        showUnBoundedList(names);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", 77.0));
        showUnBoundedList(books);
    }

    public static void showBoundedList(List<Object> list){
        list.forEach(System.out::println);
    }

    public static void showUnBoundedList(List<?> list){
        list.forEach(System.out::println);
        // list.add("Jyoti"); addition not allowed
    }
}
