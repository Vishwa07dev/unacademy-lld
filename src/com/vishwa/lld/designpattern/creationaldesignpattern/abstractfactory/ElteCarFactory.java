package com.vishwa.lld.designpattern.creationaldesignpattern.abstractfactory;

import com.sun.xml.internal.xsom.XSUnionSimpleType;


public class ElteCarFactory implements CarAbstractFactory{
  private String steeringWheel ;
  private String brakes ;
  private String mirrors ;

  public ElteCarFactory(String steeringWheel, String brakes, String mirrors) {
    this.steeringWheel = steeringWheel;
    this.brakes = brakes;
    this.mirrors = mirrors;
  }

  @Override
  public Car createCar() {
    System.out.println("Inside Elite Car Factory");
    return new EliteCar(steeringWheel, brakes, mirrors);
  }
}
