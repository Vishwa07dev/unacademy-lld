package com.vishwa.lld.designpattern.structuraldesignpattern.facade;

public class MongoDBReportGenerator {

  public void createConnection(){
    System.out.println("Creating the connection with MongoDB");
  }

  public void generateTheCSVReport(){
    System.out.println("Generating the CSV report from MongoDB");
  }

  public void generateThePDFReport(){
    System.out.println("Generating the PDF report from MongoDB");
  }
}
