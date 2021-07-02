package com.vishwa.lld.designpattern.creationaldesignpattern.builder;

public class MangoPeople {

  public static void main(String[] args) {

    /**
     * Basic car
     */
    Car car = new Car.
        CarBuilder("SW","M","B").build();

    System.out.println(car);


    Car car2 = new Car.
        CarBuilder("SW","M","B")
        .setAc("AC").setMusicSystem("MusicSystem").build();

    System.out.println(car2);
  }
}
