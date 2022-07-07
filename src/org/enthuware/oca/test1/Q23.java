package org.enthuware.oca.test1;

class ABCD{
    int x = 10;
    static int y = 20;
}
class MNOP extends ABCD{
    int x = 30;
    static int y = 40;
}

public class Q23 {
    public static void main(String[] args) {
        System.out.println(new MNOP().x+", "+new MNOP().y); // okay just warning
    }
}