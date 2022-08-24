package com.ocp.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test01  {
    final static String input = "137\n -104\n 2 58\n  +0\n ++3\n+1\n 23.9 \n2000000000\n-0\n five\n-1";

    public static List<Integer> iterator(String input) {
        List<Integer> result = new ArrayList<Integer>();
        String[] strList = input.split("\n");
        List<String> inputList = Arrays.asList(strList);
        inputList.forEach(x -> {
            String temp = x.toString().trim();
            try {
                Integer a = Integer.parseInt(temp);
                if (Math.abs(a)<=1000000000) {
                    result.add(a);
                }
            } catch (Exception e) {
                System.out.println("Remove value " + temp);
            }
        });
        return result;
    }

    public static void main(String[] args) {
        System.out.println(iterator(input));
    }

}