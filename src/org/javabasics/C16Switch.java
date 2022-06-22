package org.javabasics;

public class C16Switch {
    public static void main(String[] args) {
        switchExample1("Soccer");
        switchExample1("Ice Hockey");
        switchExample1("Rugby");

        switchExample2("Soccer");
        switchExample2("Ice Hockey");
        switchExample2("Rugby");

        switchExample3();

        implicitCasting();

    }

    public static void switchExample1(String sport) {
        switch (1) {
        } //valid

        switch (sport) {
            default:
                System.out.println("Unknown sport");
                //break; will break at next break
            case "Soccer":
                System.out.println("I play soccer");
                break;
            case "Ice Hockey":
                System.out.println("I play Ice Hockey");

        }
    }
    public static void switchExample2(String sport){
        switch(1) {} //valid

        switch(sport) {

            case "Soccer":
                System.out.println("I play soccer");
                break;
            case "Ice Hockey":
                System.out.println("I play Ice Hockey");
            default:
                System.out.println("Unknown sport");
                //break;   // no significance
        }
    }

    public static void switchExample3()
    {
        var x = (byte)4; // var is byte => -128..+127
       /* switch(x){
            case -130: //out of range
            case 130:  //out of range
        }*/

       /* switch(x){
            case 3:
            case 3:  // duplicate label
        }*/

        Integer n = Integer.valueOf("4");
        switch(n){
            case 4: // entry point, keep going until "break" or end of loop
                System.out.println("4");
            case 6:
                System.out.println("6");
            default:
                System.out.println("some other number");
        }
    }

    public static void implicitCasting(){
        byte b=4;
        final int ic = 10; // compile time constant
        final int id = 200; // value beyond byte limit
        int i = 10;        // not a constant, value may be beyond limit at run time
        final int c;        // not initialized
        c = 20;             // initialized at run time
        Byte byteW = 30;     // initialized at runtime like Byte iw = new Byte(10);

        switch(b){
            case ic:        // compile time constant
//            case id:      // value beyond byte limit
//            case i:       // not a compile time constant
//            case c:       // not a compile time constant
//            case byteW:   // not a compile time constant
//            case b:       // not a compile time constant
            case 3:          // compile time constant

        }
    }
}
