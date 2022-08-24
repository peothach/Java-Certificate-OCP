package com.ocp.nestedclass;

public class AnonymousInnerClass {

  interface Function {
    void call();
  }

  public static void main(String[] args) {
    Function function = new Function() {
      // Anonymous Inner Class
      @Override
      public void call() {
        System.out.println("Hello World");
      }
    };

    function.call();
  }
}
