package com.ocp;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteFileUsingOpenCSV {
  public static void main(String[] args) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {

    String fileName = "cars.csv";
    Path myPath = Paths.get(fileName);

    var cars = List.of(new Car(1, "Audi", 52642),
        new Car(2, "Mercedes", 57127),
        new Car(3, "Skoda", 9000),
        new Car(4, "Volvo", 29000));


    try (var writer = Files.newBufferedWriter(myPath, StandardCharsets.UTF_8)) {

      StatefulBeanToCsv<Car> beanToCsv = new StatefulBeanToCsvBuilder<Car>(writer)
          .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
          .build();

      beanToCsv.write(cars);

    } catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException |
             IOException ex) {
      Logger.getLogger(WriteFileUsingOpenCSV.class.getName()).log(
          Level.SEVERE, ex.getMessage(), ex);
    }
  }

}
