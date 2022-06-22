package org.javabasics;

public class C21BreakAndContinue {
    public static void main(String[] args) {
       // nestedLoop();
       // normalBreak();
       // normalContinue();
        unreachableCode();
    }

    public static void nestedLoop(){
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                System.out.println(i+", "+j);
            }
        }
    }

    public static void normalBreak(){
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                if(j==3){
                    break;
                }
                System.out.println(i+", "+j);
            }
        }
    }

    public static void normalContinue(){
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                if(j==3){
                    continue;
                }
                System.out.println(i+", "+j);
            }
        }
    }

    public static void unreachableCode(){
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                //if(j==3) {
                    continue; // or break
               // }
               // System.out.println(i+", "+j); //unreachable code
            }
        }
    }
}
