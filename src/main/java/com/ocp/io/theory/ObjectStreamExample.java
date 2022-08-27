package com.ocp.io.theory;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ObjectStreamExample {

    // A simple class to illustrate object streams; fill a data structure, write it to a
    // temporary file and read it back and print the read data structure

    public static void main(String[] args) {
        Map<String, String> presidentsOfUS = new HashMap<>();
        presidentsOfUS.put("Barack Obama", "2009 to --, Democratic Party, 56th term");
        presidentsOfUS.put("George W.Bush", "2001 to 2009, Republican Party, 54th and 55th terms");
        presidentsOfUS.put("Bill Clinton", "1993 to 2001, Democratic Party, 52nd and 53rd terms");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.data"))) {
            oos.writeObject(presidentsOfUS);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot create a file with the given file name ");
        } catch (IOException e) {
            System.err.println("An I/O error occurred while processing the file");
        }
        // the ObjectOutputStream will auto-close, so don't have to worry about it

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))) {
            Object obj = ois.readObject();
            // first check if obj is of type Map
            if (obj != null && obj instanceof Map) {
                Map<?, ?> presidents = (Map<?, ?>) obj;
                System.out.println("President name \t Description");
                for (Map.Entry<?, ?> president: presidents.entrySet()) {
                    System.out.printf("%s \t %s %n", president.getKey(), president.getValue());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot create a file with the given file name ");
        } catch (IOException e) {
            System.err.println("An I/O error occurred while processing the file");
        } catch (ClassNotFoundException e) {
            System.err.println("Cannot recognize the class of the object - is the file corrupted?");
        }
    }
}
