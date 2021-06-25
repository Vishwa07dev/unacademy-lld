package com.vishwa.lld.srp;

/**
 * This is a class violating the SRP
 */
public class Employee {

  private int id;
  private String name;
  private String doj;

  public Employee(int id, String name, String doj) {
    this.id = id;
    this.name = name;
    this.doj = doj;
  }

  /**
   * This should be decided by the company board of directors
   */
  public void calculateSalary() {
    System.out.println("Logic for calculating salary");
  }

  /**
   * This should be decided by the HR team
   */
  public void hireEmployee() {
    System.out.println("Logic for hiring employee");
  }

  /**
   * This should be decided by the Manager and evaluation comittee
   */
  public void evaluateEmployee() {
    System.out.println("Logic for evaluating employee");
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDoj() {
    return doj;
  }

  public void setDoj(String doj) {
    this.doj = doj;
  }
}
