package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.address.Address;
import com.xworkz.hospitalapp.blood_group.BloodGroup;
import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.id.IdFroof;
import com.xworkz.hospitalapp.insurence.IsInsurenceAvalable;
import com.xworkz.hospitalapp.ward.WardNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Patient {
  private  Integer p_Id;
  private String patientName;
  private Gender gender;
  private Integer age;
  private IdFroof id;
  private Long phNumber;
  private String patientAdders;
  private String deceaseName;
  private WardNumber wardNumber;
  private BloodGroup bloodGroup;
  private IsInsurenceAvalable isInsurenceAvalable;
  private  String attenderName;
  //private Country country;
  Address address;
}