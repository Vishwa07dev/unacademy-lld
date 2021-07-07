package com.vishwa.lld.designpattern.structuraldesignpattern.adapter;

public class Voltage {

  private int voltageReading ;

  public Voltage(int voltageReading) {
    this.voltageReading = voltageReading;
  }

  public int getVoltageReading() {
    return voltageReading;
  }

  public void setVoltageReading(int voltageReading) {
    this.voltageReading = voltageReading;
  }

  @Override
  public String toString() {
    return "Voltage{" + "voltageReading=" + voltageReading + '}';
  }
}
