package org.javaadvanced;

public class C10GenericClass {
    public static void main(String[] args) {
        MyGeneric<String> g = new MyGeneric<>("SK");
        System.out.println(g.getT());

        MyGeneric<Integer> g2 = new MyGeneric<>(3);
        System.out.println(g2.getT());
    }
}

class MyGeneric<T>{
    T t;
    MyGeneric(T t){
        this.t = t;
    }
    T getT(){
        return t;
    }
}
