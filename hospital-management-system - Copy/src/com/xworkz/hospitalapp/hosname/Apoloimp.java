package com.xworkz.hospitalapp.hosname;

import com.xworkz.hospitalapp.Patient;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.ward.WardNumber;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        isAdded=true;
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
      if (this.patient[i].getAddress().equals(address))
        System.out.println(this.patient[i]);
    }
    return null;
  }
  
  @Override
  public String getPatientNameByWardNo(String wardNo) {
    System.out.println("get patient by ward number");
    // WardNumber wardNumber = WardNumber.valueOf(wardNo);
    for (int n = 0; n < patient.length; n++) {
      if (patient[n].getWardNumber().toString().equals(wardNo))
        System.out.println(patient[n]);
    }
    return null;
  }
  
  @Override
  public String[] getPatientNameByDieseaseName(String dieseaseName) {
    int patientIndex=0;
    String[] patientNames=new String[0];
    for (Patient bed:this.patient) {
      if(bed.getDeceaseName().equals(dieseaseName)){
        patientNames= Arrays.copyOf(patientNames,patientNames.length+1);
        patientNames[patientIndex++]=bed.getPatientName();
      }
    }
    return patientNames;
  }
  
  // @Override
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
  
  @Override
  public boolean updatePatientAgeByPatientId(int exestingP_id, int updateAge) {
    boolean isUpdate = false;
    for (Patient value : this.patient) {
      if (value.getP_Id() == exestingP_id) {
        value.setAge(updateAge);
        isUpdate = true;
        System.out.println(value);
      }
    }
    return isUpdate;
  }
  
  @Override
  public Patient getPatientById(int patientId) {
    System.out.println("GEt patient details by using id");
    Patient p = null;
    if (patientId != 0) {
      for (Patient pat : this.patient) {
        if (pat.getP_Id() == patientId) {
          p = pat;
        }
      }
    }
    return p;
  }

  @Override
  public String getPatientAttenderNameByPatientId(int patientId) {
      for(int n=0;n<this.patient.length;n++){
        if(this.patient[n].getP_Id()==patientId){
          System.out.println(patient[n].getAttenderName());
        }
      }
    return null;
  }
}

//1st iteration sunil has disease flu
//StringBuilder b = new StringBuilder();
//b = b.append("sunil");
//
//
//2nd iteration raja also have same disease flu
//b = b.append("sunil","raja");
//
//last print
//sop(b);
//
//String[] patientNames = new String[3];
//int patientIndex = 0;
//for (int i = 0; i< this.patient.length;i++) {
//  patientNames[patientIndex++] = this.patient[i].getPatientName();
//        }
//
//again use for loop to print patientNames
//for (String pat : patientNames) {
//  sop(pat)
//        }