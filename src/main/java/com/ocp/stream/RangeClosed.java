package com.ocp.stream;

import java.util.stream.IntStream;

public class RangeClosed {
  public static void main(String[] args) {
    /*
    Returns a sequential ordered IntStream from startInclusive (inclusive) to endInclusive (inclusive) by an incremental step of 1.
    Params:
      startInclusive – the (inclusive) initial value endInclusive – the inclusive upper bound
    Returns:
      a sequential IntStream for the range of int elements
    API Note:
      An equivalent sequence of increasing values can be produced sequentially using a for loop as follows:
         for (int i = startInclusive; i <= endInclusive ; i++) { ... }
     */
    IntStream.rangeClosed(1, 1).forEach(System.out::println);
  }
}
