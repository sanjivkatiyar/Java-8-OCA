package org.javaadvanced;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class C56SummaryStatistics {

    public static void main(String[] args) {
        stats(IntStream.of(5,10,15,20));
        stats(IntStream.empty());
    }

    public static void stats(IntStream numbers){
        IntSummaryStatistics intSummaryStatistics = numbers.summaryStatistics();
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());
    }
}
