package com.ocp.generic;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
    strings.forEach(string -> System.out.println(string));
  }
}
