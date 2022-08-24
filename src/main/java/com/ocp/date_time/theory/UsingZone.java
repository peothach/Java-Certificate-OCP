package com.ocp.date_time.theory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class UsingZone {
  public static void main(String[] args) {
    System.out.println("My zone id is: " + ZoneId.systemDefault());

    Set<String> zones = ZoneId.getAvailableZoneIds();
    System.out.println("Number of available time zones is: " + zones.size());
    System.out.println("==================================================");
    //zones.forEach(System.out::println);

    System.out.println("==================================================");
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();
    ZoneId myZone = ZoneId.systemDefault();
    ZonedDateTime zonedDateTime = ZonedDateTime.of(currentDate, currentTime, myZone);
    System.out.println(zonedDateTime);

    System.out.println("==================================================");
    ZoneId myZone1 = ZoneId.of("Asia/Kolkata");
    LocalDateTime dateTime = LocalDateTime.now();
    ZonedDateTime zonedDateTime1 = dateTime.atZone(myZone1);
    ZoneOffset zoneOffset = zonedDateTime1.getOffset();
    System.out.println(zoneOffset);
  }
}
