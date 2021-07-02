package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public class ServiceJob implements  JobChain{

  private JobChain jobChain ;
  @Override
  public void setNextChain(JobChain jobChain) {
    this.jobChain=jobChain;
  }

  @Override
  public void getJob(Person person) {
     if(person.getSkillType().equals("SERVICE")){
       System.out.println("Got a service based job");
     }else{
       this.jobChain.getJob(person);
     }
  }
}
