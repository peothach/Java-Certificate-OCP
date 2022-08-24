package com.ocp.test;

public class PassByValue {

  public static void main(String[] args) {
    int a = 4;
    changeNumber(a);
    System.out.println(a);
  }

  public static void changeNumber(int num) {
    num = 10;
  }
}
