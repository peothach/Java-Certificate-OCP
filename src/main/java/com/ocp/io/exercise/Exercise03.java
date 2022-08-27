package com.ocp.io.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.printf("%d %1$x %1$o", 16);
        // In the format specifier, "1$" refers to first argument, which is 16 in this printf statement.
        // hence "%1$x" prints the hexadecimal value of 16, which is 10.
        // Further, "%1$o" prints the octal value of 16, which is 20.
        // Hence the output "16 10 20" from this program
    }
}
