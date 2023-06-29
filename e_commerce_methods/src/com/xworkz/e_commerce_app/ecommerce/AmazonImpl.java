package com.xworkz.e_commerce_app.ecommerce;

import com.xworkz.e_commerce_app.Customer;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
public class AmazonImpl implements Ecommerce {
  Customer customer[];
  int i;
  
  public AmazonImpl(int size) {
    this.customer = new Customer[size];
  }
  
  @Override
  public boolean addCustomer(Customer customer) {
    boolean isAdded = false;
    if (customer != null) {
      System.out.println("enter your details");
      if (customer.getCustomerName() != null && !customer.getCustomerName().isEmpty()) {
        this.customer[i++] = customer;
        isAdded = true;
        System.out.println("customer data successfully stored");
      } else {
        System.out.println("failed to store customer details");
      }
    } else {
      System.out.println("already added");
    }
    return isAdded;
  }
  
  @Override
  public void getAllCustomer() {
    System.out.println("added customer details");
    for (Customer buy : this.customer) {
      System.out.println(buy);
    }
  }
  
  @Override
  public Customer getCustomerById(int custemberId) {
    System.out.println("getting customer name by id");
    Customer com = null;
    if(custemberId!=0) {
      for (Customer bring : this.customer) {
        if (bring.getCId() == custemberId) {
          com = bring;
        }
      }
    }
    return com;
  }
  
  @Override
  public Customer getCustomerByaddress(String address) {
    System.out.println("getting custemer by address");
    for (Customer c1:this.customer) {
      if(c1.getAddress().equals(address)) {
        System.out.println(c1);
      }
    }
    return null;
  }
  
  @Override
  public Customer getCustomerProductNameById(int customerId) {
    System.out.println("getting product name by id");
    for (int j = 0; j < this.customer.length; j++) {
      if(this.customer[j].getCId()==customerId) {
        System.out.println(this.customer[j].getProductName());
      }
    }
      return null;
  }
  
  @Override
  public boolean updateAddressbyID(int customerId, String updateAddress) {
    boolean isUpdate=false;
    for(Customer addr:this.customer){
      if(addr.getCId()==customerId){
        addr.setAddress(updateAddress);
        isUpdate=true;
        System.out.println(addr);
      }
    }
    return isUpdate;
  }
}
