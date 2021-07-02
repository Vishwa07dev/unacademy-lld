package com.vishwa.lld.designpattern.creationaldesignpattern.abstractfactory;

public class EliteCar implements Car{

  private String steeringWheel ;
  private String brakes ;
  private String mirrors ;

  public EliteCar(String steeringWheel, String brakes, String mirrors) {
    this.steeringWheel = steeringWheel;
    this.brakes = brakes;
    this.mirrors = mirrors;
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
