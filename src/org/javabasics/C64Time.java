package org.javabasics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C64Time {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(nowDate);
        System.out.println(nowTime);
        System.out.println(nowDateTime);
        System.out.println(now);

        // Setting up St. Patricks Day, 2022
        LocalDate localDate1 = LocalDate.of(2022,3,17);
        LocalDate localDate2 = LocalDate.parse("2022-03-17");
        // LocalDate localDate3 = LocalDate.parse("2022-17-03"); // time format error
        // LocalDate localDate3 = LocalDate.parse("2022/03/17"); // time format error
        System.out.println(localDate1);
        System.out.println(localDate2);
        // System.out.println(localDate3);

        LocalTime lectureBegins = LocalTime.of(9,0);
        LocalTime lectureEnds = LocalTime.parse("11:00");

        System.out.println(lectureBegins);
        System.out.println(lectureEnds);

    }
}
