package com.ocp.io.theory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Type {
    public static void main(String[] files) {
        if (files.length == 0) {
            System.err.println("Pass the name of the file(s) as argument");
            System.exit(-1);
        }

        // process each file passed as argument
        for (String file: files) {
            // try opening the file with FileReader
            try (FileReader inputFile = new FileReader(file)) {
                int ch = 0;
                // while there are character to fetch, read, and print the
                // character when EOF is reached, read() will return -1,
                // terminating the loop
                while ((ch = inputFile.read()) != -1) {
                    // ch is type int - covert it back too char
                    System.out.println(ch);
                    System.out.println((char) ch);
                    System.out.println("------------------");

                }
            } catch (FileNotFoundException fnfe) {
                // the passed file is not found ...
                System.err.printf("Cannot open the given file %s", file);
            } catch (IOException ioe) {
                // some IO error occurred when reading the file ...
                System.err.printf("Error when processing file %s... skipping it", file);
            }
            // try-with-resources will automatically release FileReader object
        }
    }
}
