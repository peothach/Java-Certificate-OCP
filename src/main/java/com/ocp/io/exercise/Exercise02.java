package com.ocp.io.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise02 {

    public static void main(String[] args) throws IOException {
        // Correctly reads a line of string from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        System.out.println(str);
    }
}
