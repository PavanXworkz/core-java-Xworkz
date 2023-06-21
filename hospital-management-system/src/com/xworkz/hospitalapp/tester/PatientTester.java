package com.xworkz.hospitalapp.tester;

import com.xworkz.hospitalapp.BloodGroup;
import com.xworkz.hospitalapp.Patient;
import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.hosname.Apoloimp;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.id.IdFroof;
import com.xworkz.hospitalapp.insurence.IsInsurenceAvalable;
import com.xworkz.hospitalapp.ward.WardNumber;

public class PatientTester {
  public static void main(String[] args) {
    Hospital hospital = new Apoloimp();
    Patient patient = new Patient();
    patient.setPatientName("Jayanth");
    patient.setGender(Gender.MALE);
    patient.setAge(25);
    patient.setId(IdFroof.ADH);
    patient.setPhNumber(5683613551L);
    patient.setAdders("Tharikere");
    patient.setDeceaseName("Flue");
    patient.setWardNumber(WardNumber.PE557);
    patient.setBloodGroup(BloodGroup.A_NEGATIVE);
    patient.setIsInsurenceAvalable(IsInsurenceAvalable.TRUE);
    hospital.addPatient(patient);
    
    Patient patient1 = new Patient();
    patient1.setPatientName("Meera");
    patient1.setGender(Gender.FEMALE);
    patient1.setAge(35);
    patient1.setId(IdFroof.DL);
    patient1.setPhNumber(6543613463L);
    patient1.setAdders("Mysure");
    patient1.setDeceaseName("Tahirod");
    patient1.setWardNumber(WardNumber.PE557);
    patient.setBloodGroup(BloodGroup.A_POSITIVE);
    patient1.setIsInsurenceAvalable(IsInsurenceAvalable.FALSE);
    hospital.addPatient(patient1);
    
    Patient patient2 = new Patient();
    patient2.setPatientName("Sanjay");
    patient2.setGender(Gender.MALE);
    patient2.setAge(25);
    patient2.setId(IdFroof.PAN);
    patient2.setPhNumber(95646361631L);
    patient2.setAdders("Ramnagara");
    patient2.setDeceaseName("Newro Problem");
    patient2.setWardNumber(WardNumber.PE557);
    patient2.setBloodGroup(BloodGroup.AB_POSITIVE);
    patient2.setIsInsurenceAvalable(IsInsurenceAvalable.TRUE);
    hospital.addPatient(patient2);
    
    Patient patient3 = new Patient();
    patient3.setPatientName("Kishan");
    patient3.setGender(Gender.MALE);
    patient3.setAge(40);
    patient3.setId(IdFroof.DL);
    patient3.setPhNumber(95344335351L);
    patient3.setAdders("Madanapalli");
    patient3.setDeceaseName("Hyper Tention");
    patient3.setWardNumber(WardNumber.PE557);
    patient3.setBloodGroup(BloodGroup.B_NEGATIVE);
    patient3.setIsInsurenceAvalable(IsInsurenceAvalable.TRUE);
    hospital.addPatient(patient3);
    
    Patient patient4 = new Patient();
    patient4.setPatientName("Chandan");
    patient4.setGender(Gender.MALE);
    patient4.setAge(23);
    patient4.setId(IdFroof.PAN);
    patient4.setPhNumber(861631515L);
    patient4.setAdders("Tiptur");
    patient4.setDeceaseName("Corona");
    patient4.setWardNumber(WardNumber.A507);
    patient4.setBloodGroup(BloodGroup.O_POSITIVE);
    patient4.setIsInsurenceAvalable(IsInsurenceAvalable.FALSE);
    hospital.addPatient(patient4);
    
    Patient patient5 = new Patient();
    patient5.setPatientName("Nikil");
    patient5.setGender(Gender.MALE);
    patient5.setAge(22);
    patient5.setId(IdFroof.DL);
    patient5.setPhNumber(66553355664L);
    patient5.setAdders("Kolapur");
    patient5.setDeceaseName("Jandies");
    patient5.setWardNumber(WardNumber.DF59);
    patient5.setBloodGroup(BloodGroup.A_NEGATIVE);
    patient5.setIsInsurenceAvalable(IsInsurenceAvalable.TRUE);
    hospital.addPatient(patient5);
    
    
    hospital.getAllPatient();
  }
}
