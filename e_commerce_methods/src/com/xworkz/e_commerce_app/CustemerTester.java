package com.xworkz.e_commerce_app;

import com.xworkz.e_commerce_app.constant.Gender;
import com.xworkz.e_commerce_app.constant.PaymentMethod;
import com.xworkz.e_commerce_app.ecommerce.AmazonImpl;
import com.xworkz.e_commerce_app.ecommerce.Ecommerce;

import java.util.Scanner;

public class CustemerTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("number of customer added");
    int size = sc.nextInt();
    Ecommerce ecommerce = new AmazonImpl(size);
    for (int c_num = 0; c_num < size; c_num++) {
      Customer customer = new Customer();
      System.out.println("enter customer Id");
      customer.setCId(sc.nextInt());
      System.out.println("enter customer name");
      customer.setCustomerName(sc.next());
      System.out.println("enter the phone number");
      customer.setPhoneNumber(sc.nextLong());
      System.out.println("custember address");
      customer.setAddress(sc.next());
      System.out.println("enter email id");
      customer.setEmailId(sc.next());
      System.out.println("enter the password");
      customer.setPassword(sc.next());
      System.out.println("select the gender");
      customer.setGender(Gender.valueOf(sc.next()));
      System.out.println("select payment method ");
      customer.setPaymentMethod(PaymentMethod.valueOf(sc.next()));
      System.out.println("product ordered");
      customer.setProductName(sc.next());
      System.out.println("quantity of product ordered");
      customer.setProductQuantity(sc.nextInt());
      
      ecommerce.addCustomer(customer);
    }
    String text = null;
    do {
      System.out.println("1:get all the patient details\n 2:getting custemer name by id\n 3:getting customer by address\n 4:getting product by id\n 5:update address by id");
      System.out.println("enter your choice\n");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          ecommerce.getAllCustomer();
          break;
        case 2:
          System.out.println("getting custemer details by id");
          Customer customer = ecommerce.getCustomerById(sc.nextInt());
          System.out.println(customer);
          break;
        case 3:
          System.out.println("getting customer by address");
          ecommerce.getCustomerByaddress(sc.next());
          break;
        case 4:
          System.out.println("getting product name by id");
          ecommerce.getCustomerProductNameById(sc.nextInt());
          break;
        case 5:
          System.out.println("update address by id");
          ecommerce.updateAddressbyID(sc.nextInt(), sc.next());
      }
      System.out.println("do you continue: y/n");
      text = sc.next();
    } while (text.equals("y"));
  }
}