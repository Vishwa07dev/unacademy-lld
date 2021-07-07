package com.vishwa.lld.designpattern.structuraldesignpattern;

public class ElectricCarDecorator extends  CarDecorator{

  protected Car car ;

  public ElectricCarDecorator(Car car) {
    super(car);
  }

  public void manufactureCar() {
    //First basic car will be created
    super.manufactureCar();
    System.out.println("Including  the "
        + "features of Electric car");
  }
}

