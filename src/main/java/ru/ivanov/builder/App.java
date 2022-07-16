package ru.ivanov.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

  public static void main(String[] args) {
    Truck buy = buy();
    Truck truck = buyAvito();
    Truck send = send();
    Truck2 steal = steal();
    log.info("Truck 1: {}", buy);
    log.info("Truck 2: {}", truck);
    log.info("Truck 3: {}", send);
    log.info("Truck 4: {}", steal);
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

  public static Truck2 steal() {
    return Truck2.builder()
      .owner("ООО Прокат")
      .stsNumber("123 8314")
      .year(1987)
      .driver("Петров")
      .loadCapacity(23000)
      .build();
  }
}
