package com.ocp.functional_interface;

import java.util.function.Predicate;

public class Exercise07 {
  public static void main(String[] args) {
    Predicate<String> predContains = "I am going to write OCP exam"::contains;
    checkString(predContains, "OCPJP");
  }

  static void checkString(Predicate<String> predicate, String str) {
    System.out.println(predicate.test(str) ? "contains" : "doesn't contain");
  }
}
