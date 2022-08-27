package com.ocp.io.exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Exercise01 {

    public static void main(String[] args) throws FileNotFoundException {
        OutputStream os = new FileOutputStream("log.txt");
        System.setErr(new PrintStream(os));
        System.err.println("Error");
        // This code segment redirects the System.err to the log.txt file and will write the text "error" to that file.
        // Note that, you can redirect the System.err programmatically using the setErr() method.
        // System.err is of type PrintStream, and the System.setErr() method takes a PrintStream as an argument
        // Once the error stream is set, all writes to System.err will be redirected to it. Hence, this program
        // will create log.txt with the text "error" in it
    }
}
