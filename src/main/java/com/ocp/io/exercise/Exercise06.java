package com.ocp.io.exercise;

import java.io.*;

public class Exercise06 {

    public static void main(String[] args) throws IOException {
        FileInputStream findings = new FileInputStream("log.txt");
        DataInputStream dataStream = new DataInputStream(findings);
        BufferedReader br = new BufferedReader(new InputStreamReader(dataStream));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

        // The br.close() statement will close the BufferedReader object and the underlying stream objects
        // referred to by findings and dataStream.

        // The readLine() method invoked in the statement br.readLine() can throw an IOException
        // If this exception is thrown, br.close() will not be called, resulting in a resource leak.
        // Note that, Garbage Collector will only collect unreferenced memory resources
        // It is the programmer's responsibility to ensure that all other resources such as stream object are released.
    }
}
