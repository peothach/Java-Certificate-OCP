package com.ocp.stream;

public class PeekStream {
  public static void main(String[] args) {
    //This program is terminates normally without printing any output int console
    //Because sorted() & peek() is an intermediate operation.
    "abracadabra"
        .chars()
        .distinct()
        .peek(ch -> System.out.println(ch))
        .sorted();
  }
}
