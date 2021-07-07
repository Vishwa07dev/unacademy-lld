package com.vishwa.lld.designpattern.structuraldesignpattern;

public class ElonMuskCarManufacturingUnit {

  public static void main(String[] args) {

    /**
     * Demand for Sport Car
     */
    Car sportsCar = new SportsCarDecorator(new BaseCar());

    //sportsCar.manufactureCar();

    /**
     * Demand for Electric Car
     */
    Car electricCar = new ElectricCarDecorator(new BaseCar());

    //electricCar.manufactureCar();

    /**
     * Create a Sport Electric Car
     */

    Car sportsElectricCar = new ElectricCarDecorator(new SportsCarDecorator(new BaseCar()));
    //sportsElectricCar.manufactureCar();


    Car superCar = new LuxuryCarDecorator(new ElectricCarDecorator(new SportsCarDecorator(new BaseCar())));

    superCar.manufactureCar();
  }
}
