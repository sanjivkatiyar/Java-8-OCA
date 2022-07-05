package org.enthuware.oca.standard.foundationtest;

import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        // try{}catch(IOException t){}   // checked exceptions must be thrown
        try{}catch (Throwable t){}
        try{}catch (Error e){}
        try{}catch (Exception e){}
    }
}
