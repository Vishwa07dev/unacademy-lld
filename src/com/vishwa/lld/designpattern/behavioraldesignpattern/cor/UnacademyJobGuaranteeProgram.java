package com.vishwa.lld.designpattern.behavioraldesignpattern.cor;

public class UnacademyJobGuaranteeProgram {

  public static void main(String[] args) {
    FaangJob faangJob = new FaangJob();

    ProductJob productJob = new ProductJob();

    ServiceJob serviceJob = new ServiceJob();
    /**
     * faang -> product --> service
     */
    faangJob.setNextChain(productJob);

    productJob.setNextChain(serviceJob);

    Person person = new Person("NOTHING");

    faangJob.getJob(person);

  }
}
