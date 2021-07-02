package com.vishwa.lld.designpattern.creationaldesignpattern;

public class BasicCar implements  Car{

  private String steeringWheel ;
  private String brakes ;
  private String mirrors ;

  public BasicCar(String steeringWheel, String brakes, String mirrors) {
    this.steeringWheel = steeringWheel;
    this.brakes = brakes;
    this.mirrors = mirrors;
    System.out.println("Creating a basic car");
  }

  @Override
  public String getSteeringWheel() {
    return this.steeringWheel;
  }

  @Override
  public String getBrakes() {
    return this.brakes;
  }

  @Override
  public String getMirrors() {
    return this.mirrors;
  }
}
