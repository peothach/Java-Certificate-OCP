package com.ocp.test;

public class Test03 {
  // find max sum
  public static int maxSum(int[] input) {
    int maxSum = -1;
    for(int i = 0; i < input.length; i++) {
      for (int j = 0; j <input.length; j++){
        //check i & j whether same index or not
        if (i == j) {
          continue;
        }

        if (isEquals(input[i], input[j])) {
          maxSum = Math.max(maxSum, input[i] + input[j]);
        }

      }
    }
    return maxSum;
  }

  public static boolean isEquals(int num1, int num2) {
    return calculateSumOfWhoseDigits(num1) == calculateSumOfWhoseDigits(num2);

  }

  //calculate whose digits
  public static int calculateSumOfWhoseDigits(int num) {
    int sum = 0;
    for (String i: String.valueOf(num).split("")) {
      sum += Integer.parseInt(i);
    }
    return sum;
  }

  //check two pair of numbers whose digits add up to an equals sum


  public static void main(String[] args) {
    int[] input1 = {51, 71, 17, 42};
    int[] input2 = {42, 33, 60};
    int[] input3 = {51, 32, 43};
    int[] input4 = {2,2,2,2,2};

    System.out.println("For input 1: " + maxSum(input1));
    System.out.println("For input 2: " + maxSum(input2));
    System.out.println("For input 3: " + maxSum(input3));
    System.out.println("For input 4: " + maxSum(input4));
  }
}
