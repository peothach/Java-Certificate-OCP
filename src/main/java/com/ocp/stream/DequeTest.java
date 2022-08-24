package com.ocp.stream;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DequeTest {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addAll(Arrays.asList(1,2,3,4,5));
    /*
    Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
    This method differs from poll() only in that it throws an exception if this deque is empty.
    This method is equivalent to removeFirst().
    Returns:
      the head of the queue represented by this deque
    Throws:
      NoSuchElementException – if this deque is empty
     */
    System.out.println("The removed element is: " + deque.remove());
  }
}
