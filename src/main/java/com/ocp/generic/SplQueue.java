package com.ocp.generic;

import java.util.ArrayDeque;
import java.util.Deque;

public class SplQueue {

  Deque<String> sqlQ = new ArrayDeque<>();

  void addInQueue(String customer) {
    sqlQ.addLast(customer);
  }

  void removeFront() {
    sqlQ.removeFirst();
  }

  void removeBack() {
    sqlQ.removeLast();
  }

  void printQueue(){

    System.out.println("Special queue contains: " + sqlQ);

  }
}

class SplQueueTest {

  public static void main(String []args) {

    SplQueue splQ = new SplQueue();

    splQ.addInQueue("Harrison");

    splQ.addInQueue("McCartney");

    splQ.addInQueue("Starr");

    splQ.addInQueue("Lennon");

    splQ.printQueue();

    splQ.removeFront();

    splQ.removeBack();

    splQ.printQueue();

  }

}
