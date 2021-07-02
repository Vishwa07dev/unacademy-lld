package com.vishwa.lld.designpattern.behavioraldesignpattern.observer;

public class MyBatchSubscriber implements ObserverStudent{

  private String name ;
  private VishwaSesssion vishwaSesssion ;

  public MyBatchSubscriber(String name) {
    this.name = name;
  }

  @Override
  public void update() {
    String sessionPlan = (String)vishwaSesssion.getUpdate(this);
    System.out.println("Fetched the session topic");
  }

  @Override
  public void setVishwaSessions(VishwaSesssion vishwaSessions) {
       this.vishwaSesssion = vishwaSessions;
  }

  @Override
  public String getName() {
    return this.name;
  }
}
