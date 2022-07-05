package org.javabasics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//Java 8 introduces a new package java.time to deal with dates. The old classes such as java.util.Date are not recommended anymore.
//
//        Briefly:
//        java.time Package: This is the base package of new Java Date Time API. All the commonly used classes such as
//        LocalDate, LocalTime, LocalDateTime, Instant, Period, Duration are part of this package.
//        All of these classes are immutable and thread safe.
//
//        java.time.format Package: This package contains classes used for formatting and parsing date time objects such as
//        java.time.format.DateTimeFormatter.
//
//        (The following two are not important for the exam.)
//
//        java.time.zone Package: This package contains classes for supporting different time zones and their rules.
//
//        java.time.chrono Package: This package defines generic APIs for non ISO calendar systems.
//        We can extend AbstractChronology class to create our own calendar system.
//        java.time.temporal Package: This package contains temporal objects and
//        we can use it for find out specific date or time related to date/time object.
//        For example, we can use these to find out the first or last day of the month.
//        You can identify these methods easily because they always have format “withXXX”.

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
        //System.out.println(date.format(dateTimeFormatter1)); // not ok time missing in date, run time Exception

        LocalTime time  = LocalTime.of(14,10);

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("'Phone call at' h:mm a");
        System.out.println(time.format(dateTimeFormatter3));
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("Phone call at h:mm a");// not okay text should be in single ', run time error
        System.out.println(time.format(dateTimeFormatter2));

    }
}