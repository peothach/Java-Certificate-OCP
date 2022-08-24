package com.ocp.exception.theory;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// This interface is meant implemented by classes that would read an integer from a file interface IntReader
interface IntReader {
  int readIntFromFile() throws Exception;
}

class ThrowsClause2 implements IntReader {
  // implement readIntFile with the same throws clause
  // or a more specific throws clause
  @Override
  public int readIntFromFile() throws IOException {
    Scanner consoleScanner = new Scanner(new File("integer.txt"));
    return consoleScanner.nextInt();
  }
}
