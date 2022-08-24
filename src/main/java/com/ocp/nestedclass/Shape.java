package com.ocp.nestedclass;

class Shape {
  public Shape() {
    System.out.println("Shape Constructor");
  }

  public class Color {
    public Color() {
      System.out.println("Color Constructor");
    }
  }
}
class TestColor {
  public static void main(String[] args) {
    // Compile error because
    // You need to create an instance of outer class in order to
    // create an inner class instance, as in new Shape().new Color()
    // Error ==> Shape.Color black = new Shape().Color();
    Shape.Color black = new Shape().new Color();
  }
}
