package com.ocp.functional_interface;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateBooleans {

  public static void main(String[] args) {
    Random random = new Random();
    Stream.generate(random::nextBoolean)
        .limit(2)
        .forEach(System.out::println);
  }
}
