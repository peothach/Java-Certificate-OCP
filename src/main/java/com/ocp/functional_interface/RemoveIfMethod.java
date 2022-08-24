package com.ocp.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfMethod {
  public static void main(String[] args) {
    List<String> greeting = new ArrayList<>();
    greeting.add("hello");
    greeting.add("world");

    // way 1
    greeting.removeIf(str -> !str.startsWith("h"));
    // way 2
    greeting.removeIf(((Predicate<String>) str -> str.startsWith("h")).negate());

    greeting.forEach(System.out::println);
  }
}
