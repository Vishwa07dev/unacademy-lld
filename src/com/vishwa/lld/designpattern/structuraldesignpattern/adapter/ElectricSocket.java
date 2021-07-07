package com.vishwa.lld.designpattern.structuraldesignpattern.adapter;

public class ElectricSocket {

  public Voltage fetchElectricVoltage(){
    return new Voltage(240);
  }

}
