package com.ocp.nestedclass;

class LambdaFunctionTest {

  @FunctionalInterface
  interface LambdaFunction {
    int apply(int j);
    boolean equals(Object argo);
  }

  public static void main(String[] args) {
    LambdaFunction lambdaFunction = i -> i*i;
    System.out.println(lambdaFunction.apply(10));
  }

}
