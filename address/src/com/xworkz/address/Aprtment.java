package com.xworkz.address;

public class Aprtment extends Residence{
  private String houseNumber;
  
  public Aprtment(String buildingName, String houseNumber, String road, String block, String area, String city) {
    super(buildingName,road, block, area, city);
    this.houseNumber=houseNumber;
    
    
  }
  
  public String getHouseNumber() {
    return houseNumber;
  }
  
  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }
  
  @Override
  public String toString() {
    return "Aprtment{" +
            "houseNumber='" + houseNumber + '\'' +
            '}';
  }
}
