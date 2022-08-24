package com.ocp.exception.exercise;

public class ExceptionTest {

  public static void foo() {
    try {
      throw new ArrayIndexOutOfBoundsException();
    } catch (ArrayIndexOutOfBoundsException oob) {
      // Since Exception is a checked exception, it must be declared in the throws clause of foo().
      // hence this program results in this class
      //Error => throw new Exception(oob);
    }
  }

  public static void main(String[] args) {
    try {
      foo();
    } catch (Exception re) {
      System.out.println(re.getCause());
    }
  }
}
