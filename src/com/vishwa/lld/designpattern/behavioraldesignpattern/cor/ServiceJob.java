package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public class ServiceJob implements  JobChain{

  /**
   * Know who is next in the job chain
   */
  private JobChain jobChain;

  /**
   * This method will be used for setting the
   * next JobChain
   * @param jobChain
   */
  @Override
  public void setNextChain(JobChain jobChain) {
    this.jobChain = jobChain;
  }

  @Override
  public void getJob(Person person) {
    if( person.getSkillType().equals("SERVICE")){
      System.out.println("Got selected in SERVICE");
    }else{
      System.out.println("Got rejected in SERVICE");
      System.out.println("Need to prepare more !!!");
    }
  }
}
