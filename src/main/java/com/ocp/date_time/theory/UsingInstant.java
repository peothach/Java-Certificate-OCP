package com.ocp.date_time.theory;

import java.time.*;

public class UsingInstant {

  public static void main(String[] args) {
    //prints the current timestamp with UTC as time zone
    Instant currTimeStamp = Instant.now();
    System.out.println("Instant timestamp is: " + currTimeStamp);
    //prints the number of seconds as Unix timestamp from epoch time
    System.out.println("Number of seconds elapsed: " + currTimeStamp.getEpochSecond());
    //print the unix timestamp in milliseconds
    System.out.println("Number of milliseconds elapsed: " + currTimeStamp.toEpochMilli());

    // What is different between LocalDateTime and Instant?
    LocalDateTime localDateTime = LocalDateTime.now();
    Instant instant = Instant.now();
    System.out.println("LocalDateTime is: " + localDateTime + " \nInstance is:" + instant.getEpochSecond());

    //Test

    LocalDate currentDate = LocalDate.now();
    LocalTime startTime = LocalTime.MIN;

    LocalTime endTime = LocalTime.MAX;

    LocalDateTime start = LocalDateTime.of(currentDate, startTime);
    LocalDateTime end = LocalDateTime.of(currentDate, endTime);

    System.out.println("Timestamp of startTime: " + ZonedDateTime.of(start, ZoneId.systemDefault()).toEpochSecond());
    System.out.println("Timestamp of endTime: " + ZonedDateTime.of(end, ZoneId.systemDefault()).toEpochSecond());

  }

}
