package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class GooglePay implements  WalletStrategy{
  @Override
  public void pay(int amount) {
    System.out.println(""
        + "Paying by google pay , amount = "+ amount);
  }
}
