package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public interface JobChain {

  public void setNextChain(JobChain jobChain);

  public void getJob(Person person);
}
