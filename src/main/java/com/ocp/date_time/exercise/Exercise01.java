package com.ocp.date_time.exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Exercise01 {
  public static void main(String[] args) {
    LocalDate babyDOB = LocalDate.of(2015, Month.FEBRUARY, 20);
    LocalDate now = LocalDate.of(2016, Month.APRIL, 10);
    // between(LocalDate startDateInclusive, LocalDate endDateExclusive)
    System.out.println(Period.between(now, babyDOB).getYears());

  }
}
