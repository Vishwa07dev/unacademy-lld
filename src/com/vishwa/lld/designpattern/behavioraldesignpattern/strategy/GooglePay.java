package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class GooglePay implements  WalletStartegy{

  @Override
  public void pay(int amount) {
    System.out.println("Paying by Google Pay , amount = "+ amount);
  }
}
