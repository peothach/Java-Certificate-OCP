package com.ocp.exception.exercise;

import java.nio.file.AccessDeniedException;
import java.nio.file.FileSystemException;

public class Exercise01 {
}

class Base {
  public void foo() throws FileSystemException {
    throw new FileSystemException("");
  }
}

class Deri extends Base {

  /* IOException is more general than the FileSystemException
  So they are not compatible with the base method definition
  => COMPILE ERROR

  @Override
  public void foo() throws IOException {
    super.foo();
  }*/

  //================================================================================

  /* AccessDeniedException is more specific than FileSystemException
  So it is compatible with the base definition of the foo() method
  => WITHOUT COMPILE ERROR

  @Override
  public void foo() throws AccessDeniedException {
    throw new AccessDeniedException("");

  FileSystemException is more specific than FileSystemException
  Additionally RuntimeException is not a checked exception
  So the definition of the foo() method is compatible with the base definition of the foo() method

  => WITHOUT COMPILE ERROR
  @Override
  public void foo() throws FileSystemException, RuntimeException {
    throw new NullPointerException();
  }
  }*/

  //================================================================================

  /* Exception is more general than FileSystemException
  So they are not compatible with the base method definition
  => COMPILE ERROR

  @Override
  public void foo() throws Exception {
    throw new NullPointerException();
  }*/


}
