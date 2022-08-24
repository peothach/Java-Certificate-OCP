package com.ocp.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class test2  {
    final static int[] input = {51,71,17,42};
    final static int[] input1 = {42,33,60};
    final static int[] input2 = {51,32,43};
    final static int[] input3 = {2,2,2,2,2};
    public static int iterator(int[] input) {
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        for (int i : input) {
            if (i<0||i>1000000000||input.length==0||input.length>200000) {
                System.out.println("Input array out of range");
                return -1;
            }
            char[]charlist = String.valueOf(i).toCharArray();
            int sum = 0;
            for (int j : charlist) {
                sum += Integer.parseInt(Character.toString(j));
            }
            if (map.get(sum)==null){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                map.put(sum,temp);
            } else {
                map.get(sum).add(i);
            }
        }
        final Result max = new Result(0);
        map.forEach((x,y) -> {
            y.sort((a,b) -> a.compareTo(b));
            if (y.size()>=2) {
                int temp = y.get(y.size()-1) + y.get(y.size()-2);
                if (temp>max.value) {
                    max.setValue(temp);
                    max.setValue1(y.get(y.size()-1));
                    max.setValue2(y.get(y.size()-2));
                }
            }
        });
        if (max.getValue() == 0) {
            System.out.println("No pairs of value satify condition");
            return -1;
        } else {
            System.out.println("The pair is "+ max.getValue1() + " " +max.getValue2());
        }
        return max.getValue();
    }

    public static class Result {
        private int value;
        private int value1 = 0;
        private int value2 = 0;
        Result(int i) {
            this.value = i;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public void setValue1(int value1) {
            this.value1 = value1;
        }
        public void setValue2(int value2) {
            this.value2 = value2;
        }
        public int getValue1() {
            return value1;
        }
        public int getValue2() {
            return value2;
        }

    }

    public static void main(String[] args) {
        System.out.println(iterator(input));
        System.out.println(iterator(input1));
        System.out.println(iterator(input2));
        System.out.println(iterator(input3));
    }

}

