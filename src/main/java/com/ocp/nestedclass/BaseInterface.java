package com.ocp.nestedclass;

interface BaseInterface {
  default void foo() {
    System.out.println("BaseInterface's foo");
  }

  interface DerivedInterface extends BaseInterface {
    @Override
    default void foo() {
      System.out.println("DerivedInterface's foo");
    }
  }

  interface AnotherInterface {
    public static void foo() {
      System.out.println("AnotherInterface's foo");
    }
  }

  public class MultipleInheritance implements DerivedInterface, AnotherInterface {
    public static void main(String[] args) {
      // get default method
      new MultipleInheritance().foo();
      // static method is called in AnotherInterface
      AnotherInterface.foo();
    }
  }
}

