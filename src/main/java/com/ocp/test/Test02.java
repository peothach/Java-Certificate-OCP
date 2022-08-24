package com.ocp.test;

import java.util.Arrays;
import java.util.stream.IntStream;

class Test02 {
    final static int[] input = {6,2,3,5,6,3};
    final static int[] input1 = {1,2,1};
    final static int[] input2 = {2,1,4,4};
    final static int[] input3 = {2,2,2,2,2};

    public static int iterator(int[] input) {
        // sai input3
        int length = input.length;
        int sum  = IntStream.range(1, length).sum();
        int result = Math.abs(length*(length+1)/2 - sum);
        if (result > 1000000000) return -1;
        return result;
    }

    public static int iterator1(int[] input) {
  
        int sum = 0;
        int length = input.length;
        Arrays.sort(input);
        for (int i =1; i<=length; i++) {
            sum += Math.abs(input[i-1] - i);
            if (sum>1000000000) {
                return -1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(iterator1(input));
        System.out.println(iterator1(input1));
        System.out.println(iterator1(input2));
        System.out.println(iterator1(input3));
    }

}
