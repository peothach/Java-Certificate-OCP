package com.ocp.nestedclass;

class ShapeTwo {
  private boolean isDisplayed;
  protected int canvasID;

  public ShapeTwo() {
    isDisplayed = false;
    canvasID = 0;
  }

  public class Color {
    public void display() {
      System.out.println("isDisplayed: " + isDisplayed);
      System.out.println("canvasID: " + canvasID);
    }
  }
}

class TestColorTwo {
  public static void main(String[] args) {
    ShapeTwo.Color black = new ShapeTwo().new Color();
    black.display();
  }
}
