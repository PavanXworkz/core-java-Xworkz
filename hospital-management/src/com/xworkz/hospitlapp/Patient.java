package com.xworkz.hospitlapp;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    private boolean isAlive;
    private long phoneNumber;
    private boolean isInsured;
    String deseaseName;

    Patient(int patientId, String name, int age, boolean isAlive, long phoneNumber, boolean isInsured, String deseaseName) {
//        this.patientId = patientId;
//        this.name = name;
//        this.age = age;
//        this.isAlive = isAlive;
//        this.phoneNumber = phoneNumber;
//        this.isInsured = isInsured;
//        this.deseaseName = deseaseName;
    }

    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean getIsInsured(){
        return isInsured;
    }
    public void setIsInsured(boolean isInsured){
        this.isInsured= isInsured;
    }
    public String getDeseaseName( ){
        return deseaseName;
    }
    public void setDeseaseName(String deseaseName){
        this.deseaseName=deseaseName;
    }

}
