package com.ocp;

import com.opencsv.CSVParser;
import com.opencsv.CSVWriter;
import com.opencsv.ICSVParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OpenCSV {

  public static void main(String[] args) throws IOException {
    String csv = "employee.csv";

    //using custom delimiter and quote character
    CSVWriter csvWriter = new CSVWriter(new FileWriter(csv, true));

    List<Employee> emps = Arrays.asList(
        new Employee("Bill", 25),
        new Employee("Bill", 25),
        new Employee("Bill", 25)
    );

    List<String[]> data = toStringArray(emps);

    csvWriter.writeAll(data, false);

    csvWriter.close();
  }

  private static List<String[]> toStringArray(List<Employee> emps) {
    List<String[]> records = new ArrayList<>();

    // adding header record
    records.add(new String[]{"ID", "AGE"});

    emps.forEach(emp -> {
      records.add(new String[]{
          emp.getName(),
          String.valueOf(emp.getAge())
      });
    });
    return records;
  }
}
