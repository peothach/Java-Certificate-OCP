package com.ocp.nestedclass;

public enum EnumTest {

  // Error ==> PrinterType printerType;

//  enum PrinterType {INKJET, DOTMATRIX, LASER}
//
//  private EnumTest(PrinterType pType) {
//    //Error ==> printerType = pType;
//  }

  //Enum doesn't allow public method in class
//  public static void main(String[] args) {
//    // You cannot create an instance of the Enum
//    // Error => PrinterType pType = new PrinterType();
//
//    // Error => EnumTest enumTest = new EnumTest(EnumTest.PrinterType.LASER);
//  }
}
