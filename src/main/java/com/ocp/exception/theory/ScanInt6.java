package com.ocp.exception.theory;

import java.util.Scanner;

public class ScanInt6 {
  public static void main(String[] args) {
    System.out.println("Type an integer in console");
    Scanner consoleScanner = new Scanner(System.in);

    try {
      System.out.println("You typed the integer value: " + consoleScanner.nextInt());
      System.out.println("Done reading the text... closing the Scanner");
      consoleScanner.close();
    } catch (Exception e) {
      // call all other exceptions here ...
      consoleScanner.close();
      System.out.println("Error: Encountered an exception and could not read an integer from the console...");
      System.out.println("Existing the program - restart and try the program again!");
    }
  }
}
