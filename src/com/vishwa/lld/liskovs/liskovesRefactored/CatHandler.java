package com.vishwa.lld.liskovs.liskovesRefactored;

public class CatHandler {

  public static void main(String[] args) {
    /**
     * Liskov's principle is not violated now
     */
    MechanicalCat mechanicalCat = new ToyCat();
    mechanicalCat.speak();

    LivingCat livingCat = new PetCat();
    livingCat.drinkMilk();
    livingCat.speak();
  }
}
