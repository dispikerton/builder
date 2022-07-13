package ru.ivanov.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Truck {
  private final String owner;
  private final String stsNumber;
  private final int year;
  private final String trailer;
  private final String driver;
  private final int loadCapacity;
}
