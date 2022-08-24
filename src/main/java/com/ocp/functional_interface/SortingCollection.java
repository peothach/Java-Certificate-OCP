package com.ocp.functional_interface;

import java.util.Arrays;
import java.util.List;

public class SortingCollection {

  public static void main(String[] args) {
    List words =
        Arrays.asList("follow your heart but take your brain with you".split(" "));

    words.stream().distinct().sorted().forEach(System.out::println);
  }
}
