package com.xworkz.hospitalapp.exception;

public class WardNotFoundException extends RuntimeException {
  
  public WardNotFoundException(String wardNo) {
    System.out.println("No ward Found for" + wardNo);
  }
}
