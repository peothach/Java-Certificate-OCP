package com.ocp.generic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class RawTest1 {
  public static void main(String[] args) {
    List list = new LinkedList();
    list.add("First");
    list.add("Second");
    List<String> srtList = list; //#1

    for(Iterator<String> itemItr = srtList.iterator(); itemItr.hasNext();)
      System.out.println("Item: " + itemItr.next());

    List<String> strList2 = new LinkedList<>();
    strList2.add("First");
    strList2.add("Second");
    List list2 = strList2; //#2

    for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();)
      System.out.println("Item: " + itemItr.next());
  }
}
