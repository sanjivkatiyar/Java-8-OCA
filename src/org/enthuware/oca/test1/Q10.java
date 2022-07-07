package org.enthuware.oca.test1;

public class Q10 {
    // String s = 'a';    // not okay
    String s = this.toString();

    public static void main(String[] args) {
        System.out.println(new Q10().s);
    }
    @Override
    public String toString(){
        return "Sanjiv";
    }
}
