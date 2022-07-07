package org.enthuware.oca.test1;

public class Q59 {
    public static void main(String[] args) {
        switch(Integer.parseInt("0"))  //1
        {
            case 0 :
                boolean b = false;
                break;

            case 1 :
                b = true; //2                 // ok, b is in scope here
                break;
        }

        // if(b) System.out.println(args[2]);  // b is out of scope here
    }
}
