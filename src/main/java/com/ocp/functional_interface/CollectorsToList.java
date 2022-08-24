package com.ocp.functional_interface;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectorsToList {

  public static void main(String[] args) {
    String frenchCounting = "un:deux:trois:quatre";

    List<String> gmailList = Pattern.compile(":")
        .splitAsStream(frenchCounting)
        .collect(Collectors.toList());

    gmailList.forEach(System.out::println);
  }
}
