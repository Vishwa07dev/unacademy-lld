package com.vishwa.lld.designpattern.creationaldesignpattern.abstractfactory;

public class MukesAmbani {

  public static void main(String[] args) {


    Car basicCar  = CarFactory.getCar(new SportsCarFactory("SW","B","M"));


  }
}
