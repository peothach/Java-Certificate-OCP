package com.ocp.exception.theory;

public class InvalidInputException extends RuntimeException{

  //default constructor
  public InvalidInputException() {
    super();
  }

  //constructor that takes the String detailed information we pass while
  //raising an exception
  public InvalidInputException(String str) {
    super(str);
  }

  //constructor that remember the cause of the exception and
  // throw the new exception
  public InvalidInputException(Throwable originalException) {
    super(originalException);
  }

  // first argument takes detailed information string created while
  // raising an exception
  // and the second argument is to remember the cause of the exception
  public InvalidInputException(String str, Throwable originalException) {
    super(str, originalException);
  }
}
