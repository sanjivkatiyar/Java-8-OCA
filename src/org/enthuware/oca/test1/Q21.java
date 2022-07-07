package org.enthuware.oca.test1;

class Base {
    public Object getValue() {
        return new Object();
    }
}

class Base2 extends Base {
    @Override
    public Integer getValue() {
    //    public Integer getValue() { not okay as primitive, incompatible type, should some object
        return 10;
    }
}

public class Q21 {
    public static void main(String[] args) {
        Base b = new Base2();
        System.out.println(b.getValue());
    }
}