package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public class FaangJob implements JobChain{

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
        if( person.getSkillType().equals("FAANG")){
          System.out.println("Got selected in FAANG");
        }else{
          System.out.println("Got rejected in FAANG");
          System.out.println("Applying for Product based");
          this.jobChain.getJob(person);
        }
  }
}
