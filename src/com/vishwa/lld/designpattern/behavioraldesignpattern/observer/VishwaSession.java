package com.vishwa.lld.designpattern.behavioraldesignpattern.observer;

public interface VishwaSession {

  /**
   * Method to allow student registration
   */
  public void register(ObserverStudent student);

  /**
   * Method to unregister from vishwa's course
   */
  public void unregister(ObserverStudent student);

  /**
   * Notify all the students about the class
   */
  public  void notifyObservingStudents();

  /**
   * Student can themself call and ask about the session
   */
  public String getUpdate(ObserverStudent student);
}
