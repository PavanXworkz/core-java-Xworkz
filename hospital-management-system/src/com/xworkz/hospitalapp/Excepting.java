package com.xworkz.hospitalapp;

public class Excepting {
  public static void main(String[] args) {
    try {
      int n = 200 / 0;
    } catch (ArithmeticException hy) {
      System.out.println("infinet output");
    }
    System.out.println("main ends");
  }
}
