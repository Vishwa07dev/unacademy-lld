package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class TestStrategy {

  /**
   * How we can use multiple strategies
   * @param args
   */
  public static void main(String[] args) {
    Product product = new Product("Phone" , 1234);

    AmazonCart amazonCart = new AmazonCart(new PhonePay(), product);

    amazonCart.pay(1234);

  }
}
