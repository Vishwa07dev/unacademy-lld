package com.vishwa.lld.srp;

public class UIPortal {

  public static void main(String[] args) {

    Employee employee = new Employee(1, "vishwa","25June2021");

    employee.hireEmployee();
    employee.calculateSalary();
    employee.evaluateEmployee();

  }
}
