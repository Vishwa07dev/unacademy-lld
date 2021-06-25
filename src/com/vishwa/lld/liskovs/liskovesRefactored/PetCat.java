package com.vishwa.lld.liskovs.liskovesRefactored;

public class PetCat implements LivingCat{
  @Override
  public void drinkMilk(){
    System.out.println("Drinking More Milk");
  }

  public void speak(){
    System.out.println("Meou Meou like humans");
  }
}
