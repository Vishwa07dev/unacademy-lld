package com.vishwa.lld.movieApplication.entities;

import java.util.List;


public class Admin extends User{

  private long employee_id ;

  public Admin(int id, String name, Address address, int age, List<Long> phoneNumbers) {
    super(id, name, address, age, phoneNumbers);
  }

  public Admin(int id, String name, Address address, int age, List<Long> phoneNumbers, long employee_id) {
    super(id, name, address, age, phoneNumbers);
    this.employee_id = employee_id;
  }

  public long getEmployee_id() {
    return employee_id;
  }

  public void setEmployee_id(long employee_id) {
    this.employee_id = employee_id;
  }
}
