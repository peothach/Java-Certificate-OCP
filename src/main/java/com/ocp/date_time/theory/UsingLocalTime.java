package com.ocp.date_time.theory;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class UsingLocalTime {

  public static void main(String[] args) {
    LocalTime currTime = LocalTime.now();
    System.out.println(currTime);

    //of
    System.out.println(LocalTime.of(18, 30));

    //plus, subtract, minus
    long hours = 6;
    long minutes = 30;
    LocalTime meetingTime = LocalTime.now();
    System.out.println("Current time is: " + meetingTime);
    System.out.println("My meeting is at: " + meetingTime.plusHours(hours).plusMinutes(minutes).minusMinutes(20));

    //Clock
    System.out.println(LocalTime.now(Clock.systemDefaultZone()));
    System.out.println(LocalTime.now(Clock.system(ZoneId.of("Asia/Tokyo"))));

    //Zone
    System.out.println(LocalTime.now(ZoneId.of("Asia/Tokyo")));

    //SecondOfDay
    LocalTime.ofSecondOfDay(66620);

    //parse
    System.out.println(LocalTime.parse("18:30:05"));


  }
}
