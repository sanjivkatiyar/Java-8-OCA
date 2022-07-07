package org.enthuware.oca.test1;

public class Q7 {
    public void switchString(String input){
        switch(input){
            default : System.out.println( "none" );
            case "a" : System.out.println( "apple" );
                break;
            case "B" : System.out.println( "bat" );
            case "b" : System.out.println( "big bat" );

        }
    }

    public static void main(String[] args) throws Exception {
        Q7 tc = new Q7();
        tc.switchString("B");
        System.out.println();
        tc.switchString("DD");
    }
}
