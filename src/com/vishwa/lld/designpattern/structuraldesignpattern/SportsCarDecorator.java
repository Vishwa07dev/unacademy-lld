package com.vishwa.lld.designpattern.structuraldesignpattern;

public class SportsCarDecorator extends  CarDecorator{

  public SportsCarDecorator(Car car) {
    super(car);
  }

  public void manufactureCar() {
    //First basic car will be created
    super.manufactureCar();
    System.out.println("Including  the "
        + "features of Sports car");
  }
}
