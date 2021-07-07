package com.vishwa.lld.movieApplication.entities;

public class Address {

  private String lane1 ;
  private String lane2 ;
  private int zipCode ;
  private String city ;
  private String state ;
  private String country ;

  public Address(String lane1, String lane2, int zipCode, String city, String state, String country) {
    this.lane1 = lane1;
    this.lane2 = lane2;
    this.zipCode = zipCode;
    this.city = city;
    this.state = state;
    this.country = country;
  }

  public String getLane1() {
    return lane1;
  }

  public void setLane1(String lane1) {
    this.lane1 = lane1;
  }

  public String getLane2() {
    return lane2;
  }

  public void setLane2(String lane2) {
    this.lane2 = lane2;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
