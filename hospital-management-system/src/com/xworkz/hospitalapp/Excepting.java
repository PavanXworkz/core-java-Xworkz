package com.xworkz.hospitalapp;

import java.util.Scanner;

public class Excepting {
  public static void main(String[] args) {
    try {
      int n = 200 / 0;
      System.out.println(n);
    } catch (Exception hy) {
      System.out.println("infinet output");
    }
    
    
    String chat = null;
    String chat1 = "samosa";
    try {
      System.out.println(chat1.equals(chat));
    } catch (Exception ex) {
      System.out.println("main ends");
      
    }
    String[] games = new String[4];
    System.out.println("game starts");
    try {
      for (int i = 0; i <= 10 ; i++) {
        System.out.println(games[i]);
      }
    } catch (Exception win) {
      System.out.println("game over");
    }
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter data");
    try {
      String num = scanner.next();
      Long num1 = Long.parseLong(num);
      System.out.println(num1);
    } catch (Exception ep) {
      System.out.println("number exception");
    }
    
  }
}


//it is an unexcepted event triggers in jvm it affects flow of the program