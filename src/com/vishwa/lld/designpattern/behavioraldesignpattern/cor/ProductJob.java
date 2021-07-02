package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public class ProductJob implements  JobChain{

  private JobChain jobChain ;
  @Override
  public void setNextChain(JobChain jobChain) {
    this.jobChain = jobChain;

  }

  @Override
  public void getJob(Person person) {
       if(person.getSkillType().equals("PRODUCT")){
         System.out.println("Got the job in a product company");
       }else{
         System.out.println("Got rejected in a product company");
         this.jobChain.getJob(person);
       }
  }
}
