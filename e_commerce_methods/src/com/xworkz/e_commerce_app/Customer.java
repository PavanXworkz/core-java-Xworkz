package com.xworkz.e_commerce_app;

import com.xworkz.e_commerce_app.constant.Gender;
import com.xworkz.e_commerce_app.constant.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
  private int cId;
  private String customerName;
  private long phoneNumber;
  private String emailId;
  private String password;
  private Gender gender;
  private PaymentMethod paymentMethod;
  private String address;
  private String productName;
  private int productQuantity;
}
