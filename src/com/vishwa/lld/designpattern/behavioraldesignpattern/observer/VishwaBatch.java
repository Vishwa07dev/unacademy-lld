package com.vishwa.lld.designpattern.behavioraldesignpattern.observer;

import java.util.ArrayList;
import java.util.List;


public class VishwaBatch implements VishwaSesssion{

  private List<ObserverStudent> studentsObservers ;
  private String studyTopic ;

  public VishwaBatch() {
    this.studentsObservers = new ArrayList<>();
  }

  @Override
  public void register(ObserverStudent obj) {
    System.out.println("registering student ");
    this.studentsObservers.add(obj);
  }

  @Override
  public void unregister(ObserverStudent obj) {
    this.studentsObservers.remove(obj);
  }

  @Override
  public void notifyObservingStudents() {
    for(ObserverStudent student : studentsObservers ){
      student.update();
    }
  }

  @Override
  public Object getUpdate(ObserverStudent obj) {
    if(studentsObservers.contains(obj)){
      return this.studyTopic ;
    }
    return null ;
  }


  public void addStudyTopic(String studyTopic){

    System.out.println("Added the study topic : "+ studyTopic);
    this.studyTopic = studyTopic;
    notifyObservingStudents();
  }
}
