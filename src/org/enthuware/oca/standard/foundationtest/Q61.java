package org.enthuware.oca.standard.foundationtest;

public class Q61 {
    public static void main(String[] args) {
        Sub s = new Sub();
        int k = s.i; //assigns 20 to k.
        System.out.println(k);
        k = ((Base)s).i;//assigns 10 to k. The cast is used to show the Base's i.
        System.out.println(k);

        Base b = new Sub();
        k = b.i;
        System.out.println(k);
        k = ((Sub) b).i;
        System.out.println(k);
    }

}

class Base{
    int i=10;
    static int x = 30;
}
class Sub extends Base{
    int i=20; //This i hides Base's i.
   static int x = 40; //This x hides Base's x.
}
