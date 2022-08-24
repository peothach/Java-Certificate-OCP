package com.ocp.stream;

import java.util.stream.DoubleStream;

public class DoubleUse {

  public static void main(String[] args) {
    DoubleStream nums = DoubleStream. of(1.0, 2.0, 3.0).map(i -> -i);
    // It will throw runtime exception IllegalStateException
    // stream has already been operated upon or closed
    // count() & sum() are terminal operations in DoubleStream
    System.out.printf("count = %d, sum = %f", nums.count(), nums.sum());
  }
}
