package com.ocp.functional_interface;

import java.util.function.BiFunction;

public class Exercise05 {
  public static void main(String[] args) {
    BiFunction<String, String, Boolean> compareString = (x,y) -> x.equals(y);
    System.out.println(compareString.apply("Java8", "Java8"));
  }
}
