package com.ocp.functional_interface;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstUse01 {
  public static void main(String[] args) {
    Method[] methods = Stream.class.getMethods();
    Optional<String> methodName = Arrays.stream(methods)
        .map(method -> method.getName())
        .filter(name -> name.endsWith("Match"))
        .sorted()
        .findFirst();

    System.out.println("Result: " + methodName.orElse("No suitable method found"));
  }
}
