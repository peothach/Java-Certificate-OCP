package com.ocp.nestedclass;

public enum PrinterType {
  // Enum is seems likely static block
  // It will initialize when run in JVM
  DOTMATRIX(5), INKJECT(10), LASER(50);

  private int pagePrintCapacity;

  private PrinterType(int pagePrintCapacity) {
    this.pagePrintCapacity = pagePrintCapacity;
  }

  public int getPagePrintCapacity() {
    return pagePrintCapacity;
  }
}
