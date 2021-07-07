package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class Product {

  private String name ;
  private int cost;

  public Product(String name, int value) {
    this.name = name;
    this.cost = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }
}
