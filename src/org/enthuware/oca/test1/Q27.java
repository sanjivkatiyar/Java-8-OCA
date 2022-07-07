package org.enthuware.oca.test1;

public class Q27 {
    public static int getSwitch(String str){
        return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
    }
    public static void main(String args []){
        switch(getSwitch("--0.50")){
            case 0 : System.out.print("Hello ");
            case 1 : System.out.print("World"); break;
            default : System.out.print("Good Bye");
        }
        System.out.println(Math.round(3.3));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.6));

        System.out.println(Math.round(-3.3));
        System.out.println(Math.round(-3.5));
        System.out.println(Math.round(-3.6));
    }
}
