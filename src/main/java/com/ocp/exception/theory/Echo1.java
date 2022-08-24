package com.ocp.exception.theory;

public class Echo1 {
  public static void main(String[] args) {
    if (args.length == 0) {
      // no arguments passed - throw an exception
      throw new IllegalArgumentException("No input passed to echo command");
    } else {
      for(String str: args) {
        // command-line arguments are separated and passed as an array
        // print them by adding a space between the array elements
        System.out.println(str + "");
      }
    }
  }
}
