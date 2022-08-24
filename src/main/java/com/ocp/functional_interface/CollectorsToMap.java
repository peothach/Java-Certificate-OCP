package com.ocp.functional_interface;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMap {

  public static void main(String[] args) {
    // Does not maintain the insertion order of the elements
    Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger").collect(Collectors.toMap(name -> name, name -> name.length()));

    // Way 2
    Map<String, Integer> nameLengths = Stream.of("Arnold", "Alois", "Schwarzenegger").collect(Collectors.toMap(Function.identity(), name -> name.length()));
    nameLength.forEach((name, length) -> System.out.printf("%s-%d\n", name, length));
    nameLengths.forEach((name, length) -> System.out.printf("%s-%d\n", name, length));
  }
}
