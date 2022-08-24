package com.ocp.date_time.exercise;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise03 {
  public static void main(String[] args) {
    ZoneId zoneId = ZoneId.of("Asia/Singapore");
    ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
    System.out.println(zonedDateTime.getOffset());
  }
}
