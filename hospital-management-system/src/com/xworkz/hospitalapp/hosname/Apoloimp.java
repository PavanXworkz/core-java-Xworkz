package com.xworkz.hospitalapp.hosname;

import com.xworkz.hospitalapp.Patient;
import com.xworkz.hospitalapp.hospital.Hospital;

public class Apoloimp implements Hospital {
  Patient patient[] = new Patient[6];
  int i;
  
  @Override
  public boolean addPatient(Patient patient) {
    boolean isAdded = false;
    if (patient != null) {
      System.out.println("proceed filling details");
      //  patient = null                          patient = " ";
      if (patient.getPatientName() != null && !patient.getPatientName().isEmpty()) {
        this.patient[i] = patient;
        i++;
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
}