package org.javaadvanced;

import java.util.Optional;

public class C59Optional {
    public static void main(String[] args) {
        System.out.println(calcAverage());
        System.out.println(calcAverage(3));
        System.out.println(calcAverage(3,5,7).get());
    }

    public static Optional<Double> calcAverage(int... scores){
        if(scores.length==0) return Optional.empty();
        int sum = 0;
        for(int score:scores)
            sum+=score;
        return Optional.of((double)sum/scores.length);
    }
}
