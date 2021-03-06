package org.javabasics;

// String[] sa1, sa2; Here, both - sa1 and sa2 are String arrays.
// String sa1[], sa2; Here, only sa1 is a String array. sa2 is just a String.
// Array size cannot be given here as the array is being initialized in the declaration.
public class C59Arrays {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = {1,2,3};
        int c[];
        c = new int[6];
        new C59Arrays().takesArray(new int[] {1,2,3});

        ex1();
    }
    void takesArray(int []a){}
    private static void ex1(){
        Car1[] cars = {new Car1(), new Ferrari(), new Subaru()};
    }

    private static void ex2(){
        Sporty[] car2 = {
                new Subaru2(),    // ok
                new Ferrari2(),   // ok, even comma is okay at last
                //new Ford2()     // not okay
        };
    }
}

class Car1{}
class Subaru extends Car1{}
class Ferrari extends  Car1{}


interface Sporty{}
class Car2{}
class Subaru2 extends Car2 implements Sporty{}
class Ferrari2 extends Car2 implements Sporty{}
class Ford2 extends Car2{}




