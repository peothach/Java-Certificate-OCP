package com.ocp.nestedclass;

public class PigLatin {

  @FunctionalInterface
  interface SuffixFunction {
    void call();
  }

  public static void main(String[] args) {
    String world = "Hello";
    SuffixFunction suffixFunction = () -> System.out.println(world + "ay");
    suffixFunction.call();
  }
}
