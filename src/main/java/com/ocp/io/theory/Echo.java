package com.ocp.io.theory;

import java.io.Console;

public class Echo {
    public static void main(String[] args) {
        // get the System console object
        Console console = System.console();

        console.printf(console.readLine());

        if (console == null) {
            System.out.println("Cannot retrieve console object - are you running your application from an IDE? Existing the application ...");
            System.exit(-1);
        }
    }
}
