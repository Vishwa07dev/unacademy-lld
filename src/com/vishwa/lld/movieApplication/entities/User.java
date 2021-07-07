package com.vishwa.lld.movieApplication.entities;

import java.util.List;


public class User {

  protected int id ;
  protected String name ;
  protected Address address ;
  protected int age ;
  protected List<Long> phoneNumbers ;

  public User(int id, String name, Address address, int age, List<Long> phoneNumbers) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.age = age;
    this.phoneNumbers = phoneNumbers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List<Long> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<Long> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }
}
