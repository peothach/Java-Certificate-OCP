package com.ocp;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;

public class Car {

  @CsvBindByName(column = "car_id")
  private int id;
  @CsvBindByName(column = "car_name")
  private String name;
  @CsvBindByName(column = "car_price")
  private int price;

  public Car() {
  }

  public Car(int id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {

    var builder = new StringBuilder();
    builder.append("Car{id=").append(id).append(", name=")
        .append(name).append(", price=").append(price).append("}");

    return builder.toString();
  }
}