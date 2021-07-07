package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public class ProductJob implements  JobChain{

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
    if( person.getSkillType().equals("PRODUCT")){
      System.out.println("Got selected in PRODUCT company");
    }else{
      System.out.println("Got rejected in PRODUCT company");
      System.out.println("Applying for Service based");
      this.jobChain.getJob(person);
    }
  }
}
