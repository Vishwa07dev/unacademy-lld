package com.vishwa.lld.designpattern.structuraldesignpattern.facade;

public class Client {

  public static void main(String[] args) {
    ReportFacade reportFacade = new ReportFacade();

    /**
     * Knowing historical report in PDF format
     */
    reportFacade.generateReport("HDFS","PDF");
    /**
     * Know the report frm last 24 hours data in CSV format
     */
    reportFacade.generateReport("Mongo", "CSV");

  }
}
