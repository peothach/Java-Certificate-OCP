package com.ocp.date_time.theory;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class UsingLocalDate {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println("Today's date is: " + today);

    LocalDate newYear2016 = LocalDate.of(2016, 1, 1);
    System.out.println("New year 2016: " + newYear2016);

    //LocalDate valentinesDay = LocalDate.of(2016, 14, 2);
    // Construction is followed format (year, month, day)
    // Cause Runtime Exception => System.out.println("Valentine's day is on: " + valentinesDay);

    LocalDate valentinesDay = LocalDate.of(2016, Month.FEBRUARY, 14);
    System.out.println("Valentine's day is on: " + valentinesDay);

    //The LocalDate class has methods with which you can add or subtract days, weeks, months, or years to or from the current LocalDate object
    long visaValidityDays = 108L;
    LocalDate currDate = LocalDate.now();
    System.out.println("My Visa expires on: " + currDate.plusDays(visaValidityDays));

    //Zone
    System.out.println(LocalDate.now(ZoneId.of("Asia/Kolkata")));
    System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));

    //Clock
    System.out.println(LocalDate.now(Clock.systemDefaultZone()));

    //ofYearDay
    System.out.println(LocalDate.ofYearDay(2022, 100));

    //parse
    System.out.println(LocalDate.parse("2022-08-12"));
  }
}
