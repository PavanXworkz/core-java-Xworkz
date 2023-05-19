package com.xworkz.hospitlapp;

import javafx.scene.control.TableColumn;

import java.util.Scanner;

public class PatientTester {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the patientId");
        int patientId=sc.nextInt();
        System.out.println("enter the patient name");
        String name=sc.next();
        System.out.println("enter patient age");
        int age=sc.nextInt();
        System.out.println("is patient alive");
        boolean isAlive=sc.nextBoolean();
        System.out.println("patient phone number");
        long phoneNumber=sc.nextLong();
        System.out.println("patient insurance");
        boolean isInsured=sc.nextBoolean();
        System.out.println("enter the patient decease");
        String deseaseName=sc.next();

        Patient patient=new Patient(patientId,name,age,isAlive,phoneNumber,isInsured,deseaseName);
        patient.setPatientId(patientId);
        patient.setName(name);
        patient.setAge(age);
        patient.setIsAlive(isAlive);
        patient.setPhoneNumber(phoneNumber);
        patient.setIsInsured(isInsured);
        patient.setDeseaseName(deseaseName);

        System.out.println(patient.getPatientId()+"\n "+ patient.getName()+"\n "+ patient.getAge()+"\n "+patient.getIsAlive()+" \n"+patient.getPhoneNumber()+" \n"+patient.getIsInsured()+"\n "+patient.getDeseaseName());
    }
}
