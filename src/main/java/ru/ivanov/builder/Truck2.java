package ru.ivanov.builder;

import lombok.ToString;

// Реализация билдера своими руками
@ToString
public class Truck2 {
  private final String owner;
  private final String stsNumber;
  private final int year;
  private final String trailer;
  private final String driver;
  private final int loadCapacity;

  public Truck2(String owner, String stsNumber, int year, String trailer, String driver, int loadCapacity) {
    this.owner = owner;
    this.stsNumber = stsNumber;
    this.year = year;
    this.trailer = trailer;
    this.driver = driver;
    this.loadCapacity = loadCapacity;
  }

  public static TruckBuilder builder() {
    return new TruckBuilder();
  }

  public static class TruckBuilder {
    private String owner;
    private String stsNumber;
    private int year;
    private String trailer;
    private String driver;
    private int loadCapacity;

    public TruckBuilder owner(String owner) {
      this.owner = owner;
      return this;
    }

    public TruckBuilder stsNumber(String stsNumber) {
      this.stsNumber = stsNumber;
      return this;
    }

    public TruckBuilder year(int year) {
      this.year = year;
      return this;
    }

    public TruckBuilder trailer(String trailer) {
      this.trailer = trailer;
      return this;
    }

    public TruckBuilder driver(String driver) {
      this.driver = driver;
      return this;
    }

    public TruckBuilder loadCapacity(int loadCapacity) {
      this.loadCapacity = loadCapacity;
      return this;
    }

    public Truck2 build() {
      return new Truck2(owner, stsNumber, year, trailer, driver, loadCapacity);
    }
  }
}
