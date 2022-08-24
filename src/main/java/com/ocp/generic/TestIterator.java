package com.ocp.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    for (int i = 1;i < 10;i++) {
      nums.add(i);
    }
    System.out.println("Original list " + nums);

    Iterator<Integer> numsIter = nums.iterator();
    while(numsIter.hasNext()) {
      //  remember that next() needs to be called before calling remove() in an Iterator
      numsIter.next();
      numsIter.remove();
    }
    System.out.println("List after removing all elements " + nums);

  }
}
