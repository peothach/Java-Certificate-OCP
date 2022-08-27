package com.ocp.nio.theory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo1 {
    public static void main(String[] args) {
        // create a Path object by calling static method get() in Paths class
        Path testFilePath = Paths.get("~\\Desktop\\textfile.txt");

        // retrieve basic information about path
        System.out.println("Printing file information: ");
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of target: " + testFilePath.getParent());

        // print path elements
        System.out.println("Printing elements of the path:");

        for (Path element: testFilePath) {
            System.out.println("\t path element: " + element);
        }

    }
}
