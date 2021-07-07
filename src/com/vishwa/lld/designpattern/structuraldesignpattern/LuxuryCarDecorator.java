package com.vishwa.lld.designpattern.structuraldesignpattern;

public class LuxuryCarDecorator extends  CarDecorator{


  public LuxuryCarDecorator(Car car) {
    super(car);
  }

  public void manufactureCar() {
    //First basic car will be created
    super.manufactureCar();
    System.out.println("Including  the "
        + "features of Luxury  car");
  }
}
