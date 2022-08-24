package com.ocp.date_time.exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise05 {
  public static void main(String[] args) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.US);
    // E is the day name in the week;
    // The pattern "EEEE" prints the name of the day in its full format.
    System.out.println(formatter.format(LocalDateTime.now()));
  }
}
