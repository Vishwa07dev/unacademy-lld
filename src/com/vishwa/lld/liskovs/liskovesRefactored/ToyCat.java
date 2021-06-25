package com.vishwa.lld.liskovs.liskovesRefactored;

public class ToyCat implements MechanicalCat{

  @Override
  public void speak(){
    System.out.println("Louder Meou Meou");
  }
}
