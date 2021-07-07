package com.vishwa.lld.designpattern.behavioraldesignpattern.observer;

import java.util.ArrayList;
import java.util.List;


public class VishwaBatch implements VishwaSession{
  private List<ObserverStudent> registeredStudents ;

  private String studyTopic ;

  public VishwaBatch() {
    /**
     * In the begining there will be no students
     */
    this.registeredStudents = new ArrayList<>();
  }

  @Override
  public void register(ObserverStudent student) {
    System.out.println("Registering student "+ student.getName());
    this.registeredStudents.add(student);
  }

  @Override
  public void unregister(ObserverStudent student) {
    System.out.println("Removing student with name : "+ student.getName());
  }

  /**
   * Method to notify all the registered students about a new class
   */
  @Override
  public void notifyObservingStudents() {
     for(ObserverStudent student : registeredStudents){
       student.update();
     }
  }

  /**
   * Student will be calling this method to know the session details
   *
   * @param student
   * @return
   */
  @Override
  public String getUpdate(ObserverStudent student) {
    /**
     * Check if the student is registered
     */
    if(registeredStudents.contains(student)){
      return this.studyTopic;
    }
    return null;
  }

  /**
   *  A method to update the topics of discussion every session
   */

  public void addStudyTopic(String studyTopic){
    System.out.println("Added the study topic : "+ studyTopic);
    this.studyTopic= studyTopic;
    /**
     * Notify all the users
     */
    notifyObservingStudents();
  }
}
