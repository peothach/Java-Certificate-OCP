package com.ocp.exception.exercise;

public class ChainedException {

  public static void foo() {
    try {
      throw new ArrayIndexOutOfBoundsException();
    } catch (ArrayIndexOutOfBoundsException oob) {
      RuntimeException re = new RuntimeException(oob);
      re.initCause(oob);
      throw re;
    }
  }

  public static void main(String[] args) {
    try {
      foo();
    } catch (Exception re) {
      System.out.println(re.getClass());
    }
  }

  /*
  Output will be printed IllegalStateException because
  In the expression new RuntimeException(oob), the exception object oob is already
  chained to the RuntimeException object. The method initCause() cannot be called on exception object
  that already has an exception object chained during the constructor call.
  Hence, the call re.initCause(oob); results in initCause() throwing an IllegalStateException.
   */
}
