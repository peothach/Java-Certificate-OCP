package com.ocp.exception.theory;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryWithResources1 {

  public static void main(String[] args) {
    System.out.println("Type an integer in the console: ");
    try (Scanner consoleScanner = new Scanner(System.in)) {
      System.out.println("You typed the integer value: " + consoleScanner.nextInt());
    } catch (NoSuchElementException e) {
      // catch all other exception here ...
      System.out.println("Error: Encountered an exception and could not read an integer from the console...");
      System.out.println("Exiting the program - restart and try the program again!");
    } catch (Exception e) {
      System.out.println("Error");
    }
  }
}
