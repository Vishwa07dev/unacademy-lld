package com.vishwa.lld.liskovs;

public class ToyCat implements  Cat{

  @Override
  public void drinkMilk(){
    throw new RuntimeException("I don't drink milk");
  }

  @Override
  public void speak(){
    System.out.println("Louder Meou Meou");
  }

}
