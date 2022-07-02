package org.javabasics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

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

        preDefinedFormats();
        customFormats();
    }

    private static void preDefinedFormats(){
        LocalDate date = LocalDate.of(2021, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(9,00);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));       // ok
        //System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_DATE));           // not okay not available in time, run time exception

    }

    private static void customFormats(){
        // Date
        LocalDate date = LocalDate.of(2022,Month.AUGUST,10);
        System.out.println("customFormats");
        System.out.println(date);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        System.out.println(format);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd E D");  // single E will return Wed
        System.out.println(dateTimeFormatter);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd EEEE D h H m s S"); // 4 E to get name like Sunday
        System.out.println(dateTimeFormatter1);

        System.out.println(date.format(format));
        System.out.println(date.format(dateTimeFormatter));
        System.out.println(date.format(dateTimeFormatter1)); // not ok time missing in date, run time Exception
    }
}
