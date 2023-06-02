package com.xworkz.address;

public class Residence {
  private String buildingName;
  private String road;
  private String block;
  private String area;
  private String city;
  
  public Residence(String buildingName, String road, String block, String area, String city) {
    this.buildingName = buildingName;
    this.road = road;
    this.block = block;
    this.area = area;
    this.city = city;
  }
  
  public String getBuildingName() {
    return buildingName;
  }
  
  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }
  
  public String getRoad() {
    return road;
  }
  
  public void setRoad(String road) {
    this.road = road;
  }
  
  public String getBlock() {
    return block;
  }
  
  public void setBlock(String block) {
    this.block = block;
  }
  
  public String getArea() {
    return area;
  }
  
  public void setArea(String area) {
    this.area = area;
  }
  
  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  public String toString(){
    return buildingName+"\n "+road+"\n "+ block +"\n "+area+"\n "+ city;
  }
  
}
