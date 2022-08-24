package com.ocp.nestedclass;

interface DoNotThing {
  default void doNothing() {
    System.out.println("doNothing");
  }
}

@FunctionalInterface
interface DontDoAnything extends DoNotThing {
  @Override
  abstract void doNothing();
}

class LambdaTest {
  public static void main(String[] args) {
    DontDoAnything beIdle = () -> System.out.println("be idle");
    beIdle.doNothing();
  }
}
