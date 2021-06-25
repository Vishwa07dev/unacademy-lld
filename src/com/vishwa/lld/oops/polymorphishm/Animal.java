package com.vishwa.lld.oops.polymorphishm;

public class Animal {
  public void eat(){
    System.out.println("Animal is eating");
  }

  public static void main(String[] args) {

    Animal a1 = new Animal();

    Animal a2 = new Dog();

    Animal a3 = new Cat();


    a2.eat();



    Dog d = new Dog();

    d.eat();
    d.eat("Banana");

    a1.eat(); //

    a2.eat(); //

    a3.eat(); //

  }
}






class Dog extends Animal{
  public void eat(){
    System.out.println("Dog is eating");
  }

  public void eat(String food){
    System.out.println("Dog is eating "+ food);
  }

}

class Cat extends  Animal{
  public void eat(){
    System.out.println("Cat is eating");
  }

}
