package com.ocp.io.exercise;

import java.io.*;

public class Exercise05 {
    public static void main(String[] args) {
        USPresident usPresident = new USPresident("Barack Obama", "2009 to --", 56);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("USPresident.data"))) {
            oos.writeObject(usPresident);
            usPresident.setTerm(57);
            oos.writeObject(usPresident);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("USPresident.data"))) {
            Object obj =  ois.readObject();

            if (obj != null && obj instanceof USPresident) {
                USPresident newUsPresident = (USPresident) obj;
                System.out.println(newUsPresident);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // It will print 56 even though you changed the term using its setter to 57 and serialized again.
        // At the same time of serialization, Jvm checks for the duplicate object; if an object is already
        // serialized then JVM do not serialize the object again; instead, JVM store a reference to the serialize object
    }
}
