package com.vishwa.lld.designpattern.creationaldesignpattern.abstractfactory;

public class SportsCarFactory implements  CarAbstractFactory{

  private String steeringWheel ;
  private String brakes ;
  private String mirrors ;

  public SportsCarFactory(String steeringWheel, String brakes, String mirrors) {
    this.steeringWheel = steeringWheel;
    this.brakes = brakes;
    this.mirrors = mirrors;
  }

  @Override
  public Car createCar() {
    System.out.println("Inside Sports Car Factory");
    return new SportsCar(steeringWheel, brakes, mirrors);
  }
}
