package com.xworkz.hospitalapp.tester;

import com.xworkz.hospitalapp.address.*;
import com.xworkz.hospitalapp.blood_group.BloodGroup;
import com.xworkz.hospitalapp.Patient;
import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.hosname.Apoloimp;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.id.IdFroof;
import com.xworkz.hospitalapp.insurence.IsInsurenceAvalable;
import com.xworkz.hospitalapp.ward.WardNumber;

import java.util.Scanner;

public class PatientTester {
  public static void main(String[] args) {

//    Hospital hospital = new Apoloimp();
//    Patient patient = new Patient();
//    patient.setPatientName("Jayanth");
//    patient.setGender(Gender.MALE);
//    patient.setAge(25);
//    patient.setId(IdFroof.ADH);
//    patient.setPhNumber(5683613551L);
//    patient.setAdders("Tharikere");
//    patient.setDeceaseName("Flue");
//    patient.setWardNumber(WardNumber.PE557);
//    patient.setBloodGroup(BloodGroup.A_NEGATIVE);
//    patient.setIsInsurenceAvalable(IsInsurenceAvalable.TRUE);
//    hospital.addPatient(patient);
//
//    Patient patient1 = new Patient();
//    patient1.setPatientName("Meera");
//    patient1.setGender(Gender.FEMALE);
//    patient1.setAge(35);
//    patient1.setId(IdFroof.DL);
//    patient1.setPhNumber(6543613463L);
//    patient1.setAdders("Mysure");
//    patient1.setDeceaseName("Tahirod");
//    patient1.setWardNumber(WardNumber.PE557);
//    patient.setBloodGroup(BloodGroup.A_POSITIVE);
//    patient1.setIsInsurenceAvalable(IsInsurenceAvalable.FALSE);
//    hospital.addPatient(patient1);
//
//    Patient patient2 = new Patient();
//    patient2.setPatientName("Sanjay");
//    patient2.setGender(Gender.MALE);
//    patient2.setAge(25);
//    patient2.setId(IdFroof.PAN);
//    patient2.setPhNumber(95646361631L);
//    patient2.setAdders("Ramnagara");
//    patient2.setDeceaseName("Newro Problem");
//    patient2.setWardNumber(WardNumber.PE557);
//    patient2.setBloodGroup(BloodGroup.AB_POSITIVE);
//    patient2.setIsInsurenceAvalable(IsInsurenceAvalable.TRUE);
//    hospital.addPatient(patient2);
//
//    Patient patient3 = new Patient();
//    patient3.setPatientName("Kishan");
//    patient3.setGender(Gender.MALE);
//    patient3.setAge(40);
//    patient3.setId(IdFroof.DL);
//    patient3.setPhNumber(95344335351L);
//    patient3.setAdders("Madanapalli");
//    patient3.setDeceaseName("Hyper Tention");
//    patient3.setWardNumber(WardNumber.PE557);
//    patient3.setBloodGroup(BloodGroup.B_NEGATIVE);
//    patient3.setIsInsurenceAvalable(IsInsurenceAvalable.TRUE);
//    hospital.addPatient(patient3);
//
//    Patient patient4 = new Patient();
//    patient4.setPatientName("Chandan");
//    patient4.setGender(Gender.MALE);
//    patient4.setAge(23);
//    patient4.setId(IdFroof.PAN);
//    patient4.setPhNumber(861631515L);
//    patient4.setAdders("Tiptur");
//    patient4.setDeceaseName("Corona");
//    patient4.setWardNumber(WardNumber.A507);
//    patient4.setBloodGroup(BloodGroup.O_POSITIVE);
//    patient4.setIsInsurenceAvalable(IsInsurenceAvalable.FALSE);
//    hospital.addPatient(patient4);
//
//    Patient patient5 = new Patient();
//    patient5.setPatientName("Nikil");
//    patient5.setGender(Gender.MALE);
//    patient5.setAge(22);
//    patient5.setId(IdFroof.DL);
//    patient5.setPhNumber(66553355664L);
//    patient5.setAdders("Kolapur");
//    patient5.setDeceaseName("Jandies");
//    patient5.setWardNumber(WardNumber.DF59);
//    patient5.setBloodGroup(BloodGroup.A_NEGATIVE);
//    patient5.setIsInsurenceAvalable(IsInsurenceAvalable.TRUE);
//    hospital.addPatient(patient5);
    //  hospital.getAllPatient();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of patient to be added=");
    int size = sc.nextInt();
    Hospital hospital = new Apoloimp(size);
    for (int p_num = 0; p_num < size; p_num++) {
      Patient patient = new Patient();
      System.out.println("enter the patient id=");
      patient.setP_Id(sc.nextInt());
      System.out.println("enter the patient Name=");
      patient.setPatientName(sc.next());
      System.out.println("enter the patient gender MALE, FEMALE, TRANS=");
      patient.setGender(Gender.valueOf(sc.next()));
      System.out.println("enter patient age= ");
      patient.setAge(sc.nextInt());
      System.out.println("patient id proof ADH, PAN, DL=");
      patient.setId(IdFroof.valueOf(sc.next()));
      System.out.println("enter patient contact number");
      patient.setPhNumber(sc.nextLong());
     // System.out.println("Enter patient address");
     // patient.setAdders(sc.next());
      System.out.println("enter the patient decease name");
      patient.setDeceaseName(sc.next());
      System.out.println("enter the patient ward number PE557, A507, A50, DF59=");
      patient.setWardNumber(WardNumber.valueOf(sc.next()));
      System.out.println("enter patient blood group A_POSITIVE, A_NEGATIVE, B_POSITIVE, B_NEGATIVE, AB_POSITIVE, AB_NEGATIVE, O_POSITIVE, O_NEGATIVE=");
      patient.setBloodGroup(BloodGroup.valueOf(sc.next()));
      System.out.println("Check weather the patient is insured or not TRUE,FALSE");
      patient.setIsInsurenceAvalable(IsInsurenceAvalable.valueOf(sc.next()));
      System.out.println("Enter the attender Name");
      patient.setAttenderName(sc.next());
      
      DoorNo doorNo = new DoorNo();
      Street street = new Street();
      City city = new City();
      State state = new State();
      Country country = new Country();
      Address address=new Address();
      
      Scanner scan = new Scanner(System.in);
      System.out.println("enter patient door no");
      doorNo.setDoorNo(scan.nextInt());
      System.out.println("enter patient street name");
      street.setStreet(scan.next());
      System.out.println("enter patient city name");
      city.setCity(scan.next());
      System.out.println("enter patient state name ");
      state.setState(scan.next());
      System.out.println("enter patient country name");
      country.setCountry(scan.next());
      
      street.setDoorNo(doorNo);
      city.setStreet(street);
      state.setCity(city);
      country.setState(state);
        address.setCountry(country);
      patient.setAddress(address);
      
      hospital.addPatient(patient);
    }
    hospital.getAllPatient();
    
   

//    System.out.println("enter the patient address");
//    hospital.getPatientByAddress(sc.next());
//
//    System.out.println("enter the ward number");
//    hospital.getPatientNameByWardNo(sc.next());
//
//    System.out.println("enter diesease name");
//    hospital.getPatientNameByDieseaseName(sc.next());
//
//     System.out.println("update desease name by patient name");
//    hospital.updatePatientDieseaseByPatientdieseaseName(sc.next(), sc.next());
//
//    System.out.println(" update Patient Ward No By Patient Id");
//    hospital.updatePatientWardNoByPatientId(sc.nextInt(),WardNumber.valueOf(sc.next()).toString());
    
    System.out.println("update Patient Age By Patient Id");
    hospital.updatePatientAgeByPatientId(sc.nextInt(), sc.nextInt());
    
    System.out.println("get patient details by patient id");
    Patient pat = hospital.getPatientById(sc.nextInt());
    System.out.println(pat);
    
    System.out.println("get patient attender name by patient id");
    hospital.getPatientAttenderNameByPatientId(sc.nextInt());
    
    
    
  }
}