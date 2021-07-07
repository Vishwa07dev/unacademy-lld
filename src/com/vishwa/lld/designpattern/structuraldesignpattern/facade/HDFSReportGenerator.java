package com.vishwa.lld.designpattern.structuraldesignpattern.facade;

public class HDFSReportGenerator {

  public void createConnection(){
    System.out.println("Creating the connection with HDFS");
  }

  public void generateTheCSVReport(){
    System.out.println("Generating the CSV report from HDFS");
  }

  public void generateThePDFReport(){
    System.out.println("Generating the PDF report from HDFS");
  }

}
