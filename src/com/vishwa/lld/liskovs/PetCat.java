package com.vishwa.lld.liskovs;

public class PetCat implements Cat {

  @Override
  public void drinkMilk(){
    System.out.println("Drinking More Milk");
  }

  public void speak(){
    System.out.println("Meou Meou like humans");
  }

}
