package org.javaadvanced;

public class C14Equals {
    public static void main(String[] args) {
        Foo f1 = new Foo(1);
        Foo f2 = new Foo(1);
        System.out.println(f1.equals(f2));
        System.out.println(f1.equals("SK"));
    }
}

class Foo{
    private int fooValue;
    Foo(int fooValue){
        this.fooValue = fooValue;
    }

    public int getFooValue() {
        return fooValue;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Foo && this.fooValue == ((Foo)o).getFooValue();
    }
}