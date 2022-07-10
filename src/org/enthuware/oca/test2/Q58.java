package org.enthuware.oca.test2;

public class Q58 {
    public static void main(String args[]){
        int i = 0;
        loop :         // 1
        {
            System.out.println("Loop Lable line");
            try{

                for (  ;  true ;  i++ ){
                    if( i >5) break loop;       // 2
                }
                //System.out.println("sanjiv");
            }
            catch(Exception e){
                System.out.println("Exception in loop.");
            }
            finally{
                System.out.println("In Finally");      // 3
            }
        }
    }
}
