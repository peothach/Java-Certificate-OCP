package com.ocp.nestedclass;

public enum EnumTestTwo {

  // within enum we con not have a public constructor
  // Error => public EnumTestTwo() {
//  private EnumTestTwo() {
//    System.out.println("In EnumTest constructor ");
//  }

  //public void printType() {
    // Prior to Java 16, Java does not support local enum
    // Error => enum PrinterType {DOTMATRIX, INKJET, LASER}
  //}
}
