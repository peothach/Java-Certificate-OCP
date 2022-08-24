package com.ocp.functional_interface;

import java.util.stream.IntStream;

public class ReductTest {

  public static void main(String[] args) {
    System.out.println(IntStream.of(10, 20, 30, 40).reduce(0, ((sum, val) -> sum + val)));

    // Factorial of ten
    System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt());
  }
}
