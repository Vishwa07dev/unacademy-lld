package com.vishwa.lld.designpattern.behavioraldesignpattern.strategy;

public class TestStrategy {

  public static void main(String[] args) {
    Product product = new Product("Phone", 1234);

    /**
     * Test strategy is the client
     * He can decide which wallet to use
     */
    AmazonCart amazonCart = new AmazonCart(new PhonePay() , product );

    amazonCart.pay();
  }
}
