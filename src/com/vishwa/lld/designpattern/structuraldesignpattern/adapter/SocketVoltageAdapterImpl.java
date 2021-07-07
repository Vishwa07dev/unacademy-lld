package com.vishwa.lld.designpattern.structuraldesignpattern.adapter;

public class SocketVoltageAdapterImpl extends ElectricSocket implements SocketVoltageAdapter{


  @Override
  public Voltage get120VoltFromSocket() {
    Voltage voltage = fetchElectricVoltage();
    voltage.setVoltageReading(voltage.getVoltageReading()/2);
    return voltage ;
  }

  @Override
  public Voltage get240VoltFromSocket() {
    return fetchElectricVoltage();
  }

  @Override
  public Voltage get60VoltFromSocket() {
    Voltage voltage = fetchElectricVoltage();
    voltage.setVoltageReading(voltage.getVoltageReading()/4);
    return voltage ;
  }

  @Override
  public Voltage get3VoltFromSocket() {
    Voltage voltage = fetchElectricVoltage();
    voltage.setVoltageReading(voltage.getVoltageReading()/80);
    return voltage ;
  }
}
