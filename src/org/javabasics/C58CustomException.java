package org.javabasics;

public class C58CustomException {
    public static void main(String[] args) {
        try{
            walk();
        }catch (DangerException de){
            de.printStackTrace();
        }
    }

    public static void walk() throws DangerException{
        try{
            throw new BullInFieldException();
        }catch (BullInFieldException bife){
            throw new DangerException();
        }
    }

}

// Hiding Original exception from the client
class DangerException extends Exception{}
class BullInFieldException extends DangerException{}
class BigHoleException extends DangerException{}
