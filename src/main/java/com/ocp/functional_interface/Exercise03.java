package com.ocp.functional_interface;

import java.util.function.Function;

public class Exercise03 {

  public static void main(String[] args) {
    Function<Integer, Integer> negate = (i -> -i), square = (i -> i * i), negateSquare = negate.compose(square);
    // the negate.compose(square) calls square before calling negate.
    // Hence, for the given value 10, square results in 100, and when negated, it becomes -100.
    System.out.println(negateSquare.apply(10));
  }
}
