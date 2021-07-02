package com.vishwa.lld.designpattern.creationaldesignpattern.abstractfactory;

public class CarFactory {

  public static Car getCar(CarAbstractFactory carAbstractFactory){

    return carAbstractFactory.createCar();
  }
}
