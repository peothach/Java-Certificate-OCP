package com.ocp.date_time.theory;

import java.time.LocalDateTime;

public class UsingLocalDateTime {
  public static void main(String[] args) {
    LocalDateTime currDateTime = LocalDateTime.now();
    System.out.println("Today's date and current time is: " + currDateTime);

    LocalDateTime christmas = LocalDateTime.of(2015, 12, 25, 0, 0);
    LocalDateTime newYear = LocalDateTime.of(2016, 1, 1, 0, 0);
    //(year, month, dayOfMonth, hour, minute)
    System.out.println("New Year 2016 comes after Christmas 2015? " + newYear.isAfter(christmas));

    //toLocalDate, toLocalTime
    System.out.println("The date component is: " + currDateTime.toLocalDate());
    System.out.println("The time component is: " + currDateTime.toLocalTime());

  }
}
