package com.vishwa.lld.liskovs;

public class CatHandler {

  public static void main(String[] args) {

    /**
     * Here the Liskov's principle is violated because
     * we can use the parent class to represent the child object every time.
     */
    //Cat c = new PetCat();
    Cat c  =  new ToyCat();
    c.drinkMilk();
    c.speak();

  }
}
