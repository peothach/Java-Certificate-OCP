package com.ocp.diamondproblem;

public class Diamond implements Interface1, Interface2 {

  public static void main(String[] args) {

    new Diamond().foo();

  }

  @Override
  public void foo() {
    Interface1.super.foo();
  }
}
