package com.ocp.date_time.theory;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class UsingDateTimeFormatter {

  public static void main(String[] args) {
    //ISO_DATE (2015-11-05)
    //ISO_TIME (11:25:47.624)
    //RFC_1123_DATE_TIME (Thu, 5 Nov 2015 11:27:22 +0530)
    //ISO_ZONED_DATE_TIME (2015-11-05T11:30:33.49+05:30[Asia/Kolkata])
    LocalTime wakeupTime = LocalTime.of(6, 0, 0);
    System.out.println("Wake up time: " + DateTimeFormatter.ISO_TIME.format(wakeupTime));

    //custom  format
    DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
    System.out.println(customFormat.format(LocalDate.of(2016, Month.JANUARY, 01)));

    //encode by letters
    /*
    • G (era: BC, AD)
    • y (year of era: 2015, 15)
    • Y (week-based year: 2015, 15)
    • M (month: 11, Nov, November)
    • w (week in year: 13)
    • W (week in month: 2)
    • E (day name in week: Sun, Sunday)
    • D (day of year: 256)
    • d (day of month: 13)
     */
  }
}
