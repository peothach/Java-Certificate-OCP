package com.ocp.functional_interface;

import java.util.Optional;

public class OptionalStream {

  public static void main(String[] args) {
    Optional<String> string = Optional.of(" abracadabra ");
    string.map(String::trim).ifPresent(System.out::println);

    Optional<String> str = Optional.empty();
    System.out.println(str.map(String::length).orElse(-1));

    Optional<String> str1 = Optional.empty();
    System.out.println(str1.map(String::length).orElseThrow(IllegalAccessError::new));
  }
}
