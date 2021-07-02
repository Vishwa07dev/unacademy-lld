package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class PhonePay implements WalletStartegy{

  @Override
  public void pay(int amount) {
    System.out.println("Paying by Phone Pay , amount = "+ amount);
  }
}
