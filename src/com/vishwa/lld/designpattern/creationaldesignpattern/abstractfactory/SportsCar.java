package com.vishwa.lld.designpattern.creationaldesignpattern.abstractfactory;

public class SportsCar implements Car {

  private String steeringWheel ;
  private String brakes ;
  private String mirrors ;

  public SportsCar(String steeringWheel, String brakes, String mirrors) {
    this.steeringWheel = steeringWheel;
    this.brakes = brakes;
    this.mirrors = mirrors;
    System.out.println("Creating a sports car");
  }

  @Override
  public String getSteeringWheel() {
    return null;
  }

  @Override
  public String getBrakes() {
    return null;
  }

  @Override
  public String getMirrors() {
    return null;
  }
}
