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
  public  boolean updatePatientDieseaseByPatientdieseaseName(String existingPatientName ,String updateDeaseName);
  public  boolean updatePatientWardNoByPatientId(int exestingId, String updateWardNo);
  public  boolean updatePatientAgeByPatientId(int exestingP_id,int updateAge );
  public  Patient getPatientById(int patient);
  public  String getPatientAttenderNameByPatientId(int patientId);
}
