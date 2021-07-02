package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public class FangJob  implements JobChain{

  private JobChain jobChain ;


  @Override
  public void setNextChain(JobChain nextJobChain) {
    this.jobChain = nextJobChain;
  }

  @Override
  public void getJob(Person person) {
      if(person.getSkillType().equals("FAANG")){
        System.out.println("Got selected in FAANG");
      }else{
        System.out.println("Got rejected in FAANG");
        this.jobChain.getJob(person);
      }
  }
}
