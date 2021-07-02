package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public class Test {

  public static void main(String[] args) {
    FangJob fangJob = new FangJob();
    ProductJob productJob = new ProductJob();
    ServiceJob serviceJob = new ServiceJob();

    fangJob.setNextChain(productJob);
    productJob.setNextChain(serviceJob);

    Person person = new Person("FAANG");

    fangJob.getJob(person);
  }
}
