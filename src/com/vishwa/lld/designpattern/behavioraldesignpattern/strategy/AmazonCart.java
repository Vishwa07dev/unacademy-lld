package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class AmazonCart {

  private WalletStrategy _walletStrategy ;

  private Product _product;

  public AmazonCart(WalletStrategy walletStrategy, Product product) {
    _walletStrategy = walletStrategy;
    _product = product;
  }

  public void pay(){
    this._walletStrategy.pay(_product.getCost());
  }
}
