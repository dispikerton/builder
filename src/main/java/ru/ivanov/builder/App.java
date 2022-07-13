package ru.ivanov.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

  public static void main(String[] args) {
    Truck buy = buy();
    Truck truck = buyAvito();
    Truck send = send();
    log.info("Truck 1: {}", buy);
    log.info("Truck 2: {}", truck);
    log.info("Truck 3: {}", send);
  }

  public static Truck buy() {
    return Truck.builder()
      .owner("ООО Перевозочка")
      .stsNumber("123 2323")
      .year(2022)
      .build();
  }

  public static Truck buyAvito() {
    return Truck.builder()
      .owner("ИП Иванов")
      .stsNumber("123 4854")
      .year(2022)
      .driver("Иванов")
      .build();
  }

  public static Truck send() {
    return Truck.builder()
      .owner("ООО Перевозочка")
      .stsNumber("123 9424")
      .year(2022)
      .driver("Иванов")
      .loadCapacity(20000)
      .build();
  }
}
