package com.ocp.generic;

import java.util.Arrays;

public class StreamPipelineExample {

  public static void main(String[] args) {
    Arrays.stream(Object.class.getMethods()) // source
        .map(method -> method.getName()) // intermediate op
        .distinct() // intermediate op
        .forEach(System.out::println); // terminal operation

  }
}

