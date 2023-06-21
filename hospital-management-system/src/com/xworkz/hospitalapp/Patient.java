package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.id.IdFroof;
import com.xworkz.hospitalapp.insurence.IsInsurenceAvalable;
import com.xworkz.hospitalapp.ward.WardNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Patient {
  private String patientName;
  private Gender gender;
  private int age;
  private IdFroof id;
  private long phNumber;
  private String adders;
  private String deceaseName;
  private WardNumber wardNumber;
  private BloodGroup bloodGroup;
  private IsInsurenceAvalable isInsurenceAvalable;
  
}