package com.xworkz.hospitalapp.hosname;

import com.xworkz.hospitalapp.Patient;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.ward.WardNumber;

public class Apoloimp implements Hospital {
  Patient patient[];
  int i;
  
  public Apoloimp(int size) {
    patient = new Patient[size];
  }
  
  @Override
  public boolean addPatient(Patient patient) {
    boolean isAdded = false;
    if (patient != null) {
      System.out.println("proceed filling details");
      //  patient = null                          patient = " ";
      if (patient.getPatientName() != null && !patient.getPatientName().isEmpty()) {
        this.patient[i++] = patient;
        System.out.println("patient data successfully stored");
      } else {
        System.out.println("data not found");
      }
    } else {
      System.out.println("incomplete");
    }
    return isAdded;
  }
  
  @Override
  public void getAllPatient() {
    System.out.println("add patient");
    System.out.println("patient names :");
    for (Patient pnt : this.patient) {
      System.out.println(pnt);
      
    }
  }
  
  @Override
  public Patient getPatientByAddress(String address) {
    System.out.println("getting patient name by address ");
    for (int i = 0; i < this.patient.length; i++) {
      if (this.patient[i].getAdders().equals(address))
        System.out.println(this.patient[i]);
    }
    return null;
  }
  
  @Override
  public String getPatientNameByWardNo(String wardNo) {
    System.out.println("get patient by ward number");
    WardNumber wardNumber = WardNumber.valueOf(wardNo);
    for (int n = 0; n < patient.length; n++) {
      if (patient[n].getWardNumber().equals(wardNumber))
        System.out.println(patient[n]);
    }
    return null;
  }
  
  @Override
  public String[] getPatientNameByDieseaseName(String dieseaseName) {
    System.out.println("invoke get Patient Name By Diesease Name ");
    for (int i = 0; i < patient.length; i++) {
      if (patient[i].getDeceaseName().equals(dieseaseName)) {
        StringBuilder patient = new StringBuilder();
        patient = patient.append(this.patient[i].getPatientName());
        System.out.println(patient);
      }
    }
    return null;
  }
  
  @Override
  public boolean updatePatientDieseaseByPatientdieseaseName(String existingPatientName, String updateDeaseName) {
    boolean isupdate = false;
    for (int i = 0; i < this.patient.length; i++) {
      if (this.patient[i].getPatientName().equals(existingPatientName)) {
        this.patient[i].setDeceaseName(updateDeaseName);
        isupdate = true;
        System.out.println(this.patient[i]);
      }
      
    }
    return isupdate;
  }
  
  @Override
  public boolean updatePatientWardNoByPatientId(int exestingId, String updateWardNo) {
    boolean isUpdate = false;
    for (int i = 0; i < this.patient.length; i++) {
      if (this.patient[i].getP_Id() == exestingId) {
        this.patient[i].setWardNumber(WardNumber.valueOf(updateWardNo));
        isUpdate = true;
        System.out.println(this.patient[i]);
      }
    }
    return isUpdate;
  }
}