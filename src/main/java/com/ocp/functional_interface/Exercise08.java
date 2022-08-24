package com.ocp.functional_interface;

import java.util.function.ObjIntConsumer;
import java.util.stream.DoubleStream;

public class Exercise08 {
  public static void main(String[] args) {
    ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i);
    // Since System.out.println expects an argument to be passed
    // the call charAt.accept("Java", 2) results in a compiler error because accept() method returns void.
    // Error => System.out.println(charAt.accept("Java", 2));
  }
}
