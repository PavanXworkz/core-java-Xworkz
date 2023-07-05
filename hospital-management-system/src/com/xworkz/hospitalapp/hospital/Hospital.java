package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.Patient;
import com.xworkz.hospitalapp.ward.WardNumber;

public interface Hospital {
  //has a relation
  
  public boolean  addPatient(Patient patient);
  
  public  void  getAllPatient();
  
  public Patient getPatientByAddress(String address);
  
  public String getPatientNameByWardNo(String wardNo);
  
  public  String[] getPatientNameByDieseaseName(String dieseaseName);
  
  
  //  public String[] getPatientNameByDieseaseName(String dieseaseName) {
//    System.out.println("invoke get Patient Name By Diesease Name ");
//    int count=0;
//    for (int i = 0; i < patient.length; i++) {
//      if (patient[i].getDeceaseName().equals(dieseaseName)) {
//        count++;
//      }
//    }
//    String[]patientName=new String[count];
//    int patientIndex=0;
//    for (Patient pat:this.patient) {
//      if(pat.getPatientName().equals(dieseaseName)){
//        patientName[patientIndex++]=pat.getPatientName();
//      }
//    }
//    return patientName;
//  }
  
  //        StringBuilder patient = new StringBuilder();
//        patient = patient.append(this.patient[i].getPatientName());
//        System.out.println(patient);
//      }
//    }
  
  
  public  boolean updatePatientDieseaseByPatientdieseaseName(String existingPatientName , String updateDeaseName);
  
  public  boolean updatePatientWardNoByPatientId(int exestingId, String updateWardNo);
  
  public  boolean updatePatientAgeByPatientId(int exestingP_id,int updateAge );
  
  public  Patient getPatientById(int patient);
  
  public  String getPatientAttenderNameByPatientId(int patientId);
  
}
