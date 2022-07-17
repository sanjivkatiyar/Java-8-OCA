package org.javaadvanced;

import java.util.ArrayList;
import java.util.List;

public class C9SuperAndExtends {
    public static void main(String[] args) {
        Dog[] dog0 = {new Dog(), new Dog()};
        //addAnimal(dog0);         // ArrayStoreException generated - JVM knows the type

        // List<Animal> animals = new ArrayList<Cat>(); // compile time error

        List<Cat> cats1 = new ArrayList<>();
        // addAnimal(cats);                  // compile time error

        // extends is read only
        List<? extends Animal> animals1 = new ArrayList<Animal>();
        List<? extends Animal> animals2 = new ArrayList<Dog>();
        List<? extends Animal> animals3 = new ArrayList<Cat>();
        List<? extends Animal> animals4 = new ArrayList<ManX>();
        List<? extends Animal> animals5 = new ArrayList<Terner>();
        // List<? extends Animal> animals6 = new ArrayList<Object>();  // compile time error
        // animals1.add(new Dog());         // compile time error because read only

        // super
        List<? super Dog> dog1 = new ArrayList<Dog>();
        List<? super Dog> dog2 = new ArrayList<Animal>();
        List<? super Dog> dog3 = new ArrayList<Object>();
        dog1.add(new Dog());
        dog2.add(new Dog());
       //dog2.add(new Animal()); //compilation error
        dog3.add(new Dog());

        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<ManX> manxs = new ArrayList<>();
        manxs.add(new ManX());
        List<Terner> terners = new ArrayList<>();
        terners.add(new Terner());

        ext(animals);
        ext(cats);
        ext(dogs);
        ext(manxs);
        ext(terners);
        // ext(objects);   // compilation error   // upper-bound

        spr(dogs);
        spr(animals);
        spr(objects);
        //spr(cats);      // compilation error lower bound
    }

    public static void addAnimal(Animal[] animals){
        animals[0] = new Dog();
        animals[1] = new Cat();
    }

    public static void addAnimal(List<Animal> animals){
        animals.add(new Dog());
    }

    public static void ext(List<? extends Animal> list) {
        // list.add   // compile time error
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void spr(List<? super Dog> list) {
        // list.add   // compile time error
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
class ManX extends Cat{}
class Terner extends Dog{}



