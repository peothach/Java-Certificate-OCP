package com.ocp.generic;

class Pair<T1, T2> {
  T1 object1;
  T2 object2;

  Pair(T1 one, T2 two) {
    object1 = one;
    object2 = two;
  }

  public T1 getFirst() {
    return object1;
  }

  public T2 getSecond() {
    return object2;
  }
}

class PairTest {
  public static void main(String[] args) {
    Pair<Integer, String> worldCupWithoutDiamondSyntax = new Pair<Integer, String>(2018, "Russia");
    Pair<Integer, String> worldCupWitDiamondSyntax = new Pair<>(2018, "Russia");
    System.out.println("World cup " + worldCupWithoutDiamondSyntax.getFirst() + " in " +worldCupWithoutDiamondSyntax.getSecond());
  }
}
