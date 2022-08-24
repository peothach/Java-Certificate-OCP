package com.ocp.exception.theory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanInt2 {
  public static void main(String[] args) {
    System.out.println("Type an integer in the console: ");
    Scanner consoleScanner = new Scanner(System.in);
    try{
      System.out.println("You typed type the integer value: " + consoleScanner.nextInt());
    } catch (InputMismatchException ime) {
      // nextInt() throws Input Mismatch Exception in case anything
      // other than an integer is typed in the console; so handle it
      System.out.println("Error: you typed some text that is not an integer value...");
    }
  }
}
