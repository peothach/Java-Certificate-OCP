package com.ocp.generic;

class BoxPrinter<T> {
  private T val;

  public BoxPrinter(T arg) {
    val = arg;
  }

  public String toString() {
    return "[" + val + "]";
  }
}

class BoxPrinterTest {
  public static void main(String[] args) {
    BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(Integer.valueOf(10));
    System.out.println(value1);

    BoxPrinter<String> value2 = new BoxPrinter<String>("Hello World");
    System.out.println(value2);
  }
}
