package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class AmazonCart {

  private WalletStartegy _walletStartegy;

  private Product _product ;

  public AmazonCart(WalletStartegy walletStartegy, Product product) {
    _walletStartegy = walletStartegy;
    _product = product;
  }

  public void pay(int amount){
    this._walletStartegy.pay(amount);
  }
}
