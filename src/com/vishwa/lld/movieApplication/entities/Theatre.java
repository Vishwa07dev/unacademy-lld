package com.vishwa.lld.movieApplication.entities;

import java.util.List;


public class Theatre {
  private long id ;
  private Address address ;
  private List<Slot> slots ;
  private String name  ;

  public Theatre(long id, Address address, List<Slot> slots, String name) {
    this.id = id;
    this.address = address;
    this.slots = slots;
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Slot> getSlots() {
    return slots;
  }

  public void setSlots(List<Slot> slots) {
    this.slots = slots;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
