package com.ocp.date_time.theory;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class DaylightSavingTime_DST {
  public static void main(String[] args) {
    ZoneId kolkataZone = ZoneId.of("Asia/Kolkata");
    Duration kalkataDST = kolkataZone.getRules().getDaylightSavings(Instant.now());

    System.out.printf("Kolkata zones DST is: %d hours %n", kalkataDST.toHours());
    ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");

    Duration aucklandDST = aucklandZone.getRules().getDaylightSavings(Instant.now());
    System.out.printf("Auckland zone DST is: %d hours", aucklandDST.toHours());
  }
}
