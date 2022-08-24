package com.ocp.date_time.theory;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
  public static void main(String[] args) {
    LocalDate manufacturingDate = LocalDate.of(2016, Month.JANUARY, 1);
    LocalDate expiryDate = LocalDate.of(2018, Month.JULY, 18);
    Period expiry = Period.between(manufacturingDate, expiryDate);
    System.out.printf("Medicine will expire in: %d year, %d month, and %d days (%s)\n", expiry.getYears(), expiry.getMonths(), expiry.getDays(), expiry);

    /*
    Period.between(LocalDate.now(), christmas));
    Prints P1M23D as of 2015-11-02

    ======================================================================================

    Period parse(CharSequence Returns a Period from Period.parse("P4Y6M15D"); string)
    the string passed as
    returns P4Y6M15D
     */
  }
}
