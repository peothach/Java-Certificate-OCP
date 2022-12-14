package com.ocp.stream;

public class LastError<T> {
  private T lastError;

  void setError(T t){
    lastError = t;
    System.out.println("LastError: setError");
  }
}

class StrLastError<S extends CharSequence> extends LastError<String> {
  public StrLastError(S s){}

  void setError(S s) {
    System.out.println("StrLastError: setError");
  }
}

class Test {
  public static void main(String[] args) {
    StrLastError<String> err = new StrLastError<>("Error");
    // Ambiguous method call
    // Compile Error => err.setError("Last Error");
  }
}
