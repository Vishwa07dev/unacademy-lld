package com.vishwa.lld.srp.refactored;

/**
 * It's following the SRP
 * because it just contains the employee info
 */
public class EmployeeRefactored {

  private int id;
  private String name;
  private String doj;

  public EmployeeRefactored(int id, String name, String doj) {
    this.id = id;
    this.name = name;
    this.doj = doj;
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
