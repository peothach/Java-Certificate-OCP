package com.ocp.exception.theory;

import java.util.Scanner;

public class ScanInt1 {
  public static void main(String[] args) {
    System.out.println("Type an integer in the console: ");
    Scanner consoleScanner = new Scanner(System.in);
    System.out.println("You typed type the integer value: " + consoleScanner.nextInt());
  }
}
