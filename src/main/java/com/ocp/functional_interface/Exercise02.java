package com.ocp.functional_interface;

import java.util.function.Predicate;

public class Exercise02 {
  public static void main(String[] args) {
    //negate phủ định
    Predicate<String> notNull = ((Predicate<String>) arg -> arg == null).negate();
    System.out.println(notNull.test(null));
  }
}
