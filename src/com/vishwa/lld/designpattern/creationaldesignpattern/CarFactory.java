package com.vishwa.lld.designpattern.creationaldesignpattern;

public class CarFactory {
  /**
   * Create car
   * @param steeringWheel
   * @param brakes
   * @param mirrors
   * @param typeOfCar
   * @return
   */

  /**
   * I need to make changes in this class, every time
   * a new car is to be supported - O
   *
   * Multiple conditional are always
   *
   */
  public static Car createCar(String steeringWheel, String brakes,
      String mirrors , String typeOfCar){
    if(typeOfCar.equals("BASIC")){
      return new BasicCar(steeringWheel,brakes,mirrors);
    }else if(typeOfCar.equals("SPORTS")){
      return new SportsCar(steeringWheel,brakes,mirrors);
    }else{
      throw new RuntimeException("This car type is "
          + "not currently supported");
    }
  }

}
