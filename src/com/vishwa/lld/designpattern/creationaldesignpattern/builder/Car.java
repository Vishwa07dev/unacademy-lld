package com.vishwa.lld.designpattern.creationaldesignpattern.builder;

public class Car {

  /**
   * Mandatory attributes
   */
  private String steeringWheel ;
  private String mirror ;
  private String brake ;

  /**
   * Optional attributes
   */
  private String seatCover ;
  private String ac;
  private String musicSystem ;

  @Override
  public String toString() {
    return "Car{" + "steeringWheel='" + steeringWheel + '\'' + ", mirror='" + mirror + '\'' + ", brake='" + brake + '\''
        + ", seatCover='" + seatCover + '\'' + ", ac='" + ac + '\'' + ", musicSystem='" + musicSystem + '\'' + '}';
  }

  public Car(CarBuilder carBuilder){
    this.steeringWheel = carBuilder.steeringWheel;
    this.mirror = carBuilder.mirror;
    this.brake = carBuilder.brake;
    this.musicSystem = carBuilder.musicSystem;
    this.mirror = carBuilder.mirror;
    this.ac=carBuilder.ac;
  }
  public static class CarBuilder{

    /**
     * Mandatory attributes
     */
    private String steeringWheel ;
    private String mirror ;
    private String brake ;

    /**
     * Optional attributes
     */
    private String seatCover ;
    private String ac;
    private String musicSystem ;



    public CarBuilder(String steeringWheel, String mirror, String brake) {
      this.steeringWheel = steeringWheel;
      this.mirror = mirror;
      this.brake = brake;
    }

    public CarBuilder setSeatCover(String seatCover){
      this.seatCover = seatCover;
      return this;
    }

    public CarBuilder setAc(String ac){
      this.ac = ac;
      return this;
    }

    public CarBuilder setMusicSystem(String musicSystem){
      this.musicSystem = musicSystem ;
      return this ;
    }

    /**
     * This method will be used for creating the object
     * @return
     */
    public Car build(){
      return new Car(this);
    }

  }

}
