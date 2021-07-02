package com.vishwa.lld.designpattern.behavioraldesignpattern.observer;

public interface VishwaSesssion {

  public void register(ObserverStudent obj);
  public void unregister(ObserverStudent obj);

  public void notifyObservingStudents();

  public Object getUpdate(ObserverStudent obj);
}
