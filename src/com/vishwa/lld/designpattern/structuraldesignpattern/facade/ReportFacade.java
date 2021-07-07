package com.vishwa.lld.designpattern.structuraldesignpattern.facade;

public class ReportFacade {

  public void generateReport(String dataSourceType , String reportType){
    if(dataSourceType == "HDFS"){
      HDFSReportGenerator hdfs = new HDFSReportGenerator();
      hdfs.createConnection();
      if(reportType =="PDF"){

        hdfs.generateThePDFReport();
      }else{
        hdfs.generateTheCSVReport();
      }
    }else if(dataSourceType.equals("Mongo")){
      MongoDBReportGenerator mongo = new MongoDBReportGenerator();

      mongo.createConnection();
      if(reportType =="PDF"){

        mongo.generateThePDFReport();
      }else{
        mongo.generateTheCSVReport();
      }

    }

  }




}
