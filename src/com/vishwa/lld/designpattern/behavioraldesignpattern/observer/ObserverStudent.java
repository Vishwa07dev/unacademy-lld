package com.vishwa.lld.designpattern.behavioraldesignpattern.observer;

public interface ObserverStudent {

  /**
   * This method can be used to update the student
   */
  public void update();

  /**
   * Make this student aware that he has to
   * take Vishwa session
   */
  public void setVishwaSessions(VishwaSession vishwaSession);


  public String getName();
}
