package com.ocp.date_time.exercise;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Exercise04 {
  public static void main(String[] args) {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
    LocalDate dateOfBirth = LocalDate.of(2015, Month.FEBRUARY, 31);
    // Error => Runtime Exception because February < 29 day
    // => Invalid date
    System.out.println(dateTimeFormatter.format(dateOfBirth));
  }
}
