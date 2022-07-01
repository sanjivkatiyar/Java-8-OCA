package org.javabasics;

public class C48ObjectLifeCycle {
    public static void main(String[] args) {
        Goat goat1 = new Goat();
        Goat goat2 = new Goat();
        goat2.tagAnimal(goat1);
    }
}

class Tag{}
class Goat{
    Tag tag;
    String country;
    void tagAnimal(Goat goat){
        tag = new Tag();
        goat.setCountry("France");
    }
    void setCountry(String country){
        this.country=country;
    }
}
