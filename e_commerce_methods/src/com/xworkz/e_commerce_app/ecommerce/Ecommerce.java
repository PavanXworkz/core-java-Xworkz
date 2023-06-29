package com.xworkz.e_commerce_app.ecommerce;

import com.xworkz.e_commerce_app.Customer;

public interface Ecommerce {
boolean addCustomer(Customer customer);
void getAllCustomer();
Customer getCustomerById(int custemberId);
Customer getCustomerByaddress(String address);
Customer getCustomerProductNameById(int customerId);
boolean updateAddressbyID(int customerId,String address);
}
