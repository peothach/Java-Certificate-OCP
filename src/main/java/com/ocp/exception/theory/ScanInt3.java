package com.ocp.exception.theory;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanInt3 {
  public static void main(String[] args) {
    String integerStr = "";
    System.out.println("The string to scan integer from it is: " + integerStr);
    Scanner consoleScanner = new Scanner(integerStr);

    try {
      System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
    } catch (InputMismatchException ime) {
      // nextInt() throw InputMismatchException in case
      // any thing other than an integer provided in the string
      // You might not already know, but NoSuchElementException is the base class of InputMismatchException
      System.out.println("Error: Cannot scan an integer the given string");
    } catch (NoSuchElementException nsee) {
      System.out.println("Error: Cannot scan an integer from the given string");
    } catch (IllegalStateException ise) {
      System.out.println("Error: nextInt() called on a closed Scanner object");
    }
  }
}
