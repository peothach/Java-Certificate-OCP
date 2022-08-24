package com.ocp.io.theory;

import java.io.IOException;

public class Read {

    public static void main(String[] args) {
        System.out.println("Type a character: ");
        int val = 0;

        try{
            // the return type of read is int, but it return a byte value!
            val = System.in.read();
        } catch (IOException ioe) {
            System.out.println("Cannot read input " + ioe);
            System.exit(-1);
        }

        System.out.println("You typed: " + val);
    }
}
