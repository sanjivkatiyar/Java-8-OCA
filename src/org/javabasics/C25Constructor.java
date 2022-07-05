package org.javabasics;

public class C25Constructor {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Mouse m = new Mouse();
        Mouse m1 = new Mouse("Nibbles");
    }
}

class Dog{
    // will get a default constructor like below
    /*Dog(){
        super();
    }*/
}

class Cat{
    Cat(){}
}

class Mouse{
    private String theName;
    Mouse(){
        theName="";
    }
    Mouse(String aName){
        theName= aName;
    }
    void Mouse(){} // this is not a constructor but a badly written method
}

class Clothing{
    Clothing(String type){}
}

// class Shirt extends Clothing{
    // the problem is that the compiler inserts:
    // Shirt(){
    //    super();
    // }
    // but there is no no-arg constructor in clothing
//}


class Computer {
    int price;
    Computer (int price){
        this.price = price;
    }
}
// The access type of a default constructor is same as the access type of the class.
// Thus, if a class is public, the default constructor will be public.
// A constructor does not return any value at all. It is meant to initialize the state of an object.
/* will not compile as not default constructor present in super
class laptop extends Computer{

}*/
