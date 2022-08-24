package com.ocp.date_time.theory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDatePatterns {
  public static void main(String[] args) {
    String[] dataTimeFormats = {
        "dd-MM-yyyy", //d is day (in month), M is month, y is year
        "d'('E')' MMM, YYYY", //E is name of the day (in week), Y is year
        "w'th week of' YYYY", //w is the week of the year
        "EEEE, dd;th; MMMM, YYYY" //E is day name in week
    };

    LocalDateTime now = LocalDateTime.now();
    for (String dateTimeFormat : dataTimeFormats) {
      System.out.printf("Pattern \"%s\" is %s %n", dateTimeFormat, DateTimeFormatter.ofPattern(dateTimeFormat).format(now));
    }
  }
}
