package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class PhonePay implements WalletStrategy{

  @Override
  public void pay(int amount) {
    System.out.println(""
        + "Paying by phone pay , amount = "+ amount);
  }
}
