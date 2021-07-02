package com.vishwa.lld.designpattern.behavioraldesignpattern.observer;

public interface ObserverStudent {
  /**
   * Method to update the students
   */
  public void update();

  public void setVishwaSessions(VishwaSesssion vishwaSessions);

  public String getName();
}
