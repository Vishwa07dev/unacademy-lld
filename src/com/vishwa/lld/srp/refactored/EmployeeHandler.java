package com.vishwa.lld.srp.refactored;


public class EmployeeHandler {

  public static void main(String[] args) {

    EmployeeRefactored employee = new EmployeeRefactored(1, "Vishwa", "25 June 2021");

    SalaryCalculator salaryCalculator = new SalaryCalculator();
    salaryCalculator.calculateSalary(employee);

    EmployeeHiring employeeHiring = new EmployeeHiring();
    employeeHiring.hireEmployee(employee);


  }
}
