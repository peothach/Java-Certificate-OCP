package com.ocp.nestedclass;

public class BlockLambda {

  @FunctionalInterface
  interface LambdaFunction {
    String intKind(int a);
  }

  public static void main(String[] args) {
    final LambdaFunction lambdaFunction = (int i) -> {
      if (i % 2 == 0) return "even";
      else return "odd";
    };

    System.out.println(lambdaFunction.intKind(6));
  }
}
