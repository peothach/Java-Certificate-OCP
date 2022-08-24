package com.ocp.functional_interface;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerUser {

  public static void main(String[] args) {
    Stream<String> strings = Stream.of("hello", "world");
    Consumer<String> printString = System.out::println;

    strings.forEach(printString);
  }
}
