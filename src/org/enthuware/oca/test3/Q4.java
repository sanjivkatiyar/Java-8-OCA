package org.enthuware.oca.test3;

public class Q4 {
    public static void main(String[] args) {

    }

    public float parseFloat(String s){
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return f;
        }
        finally { System.out.println("finally");  }
        // return f ;                                    // return statement after finally block is invalid
    }
}
