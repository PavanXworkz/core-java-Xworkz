package com.xworkz.business;

import com.xworkz.business.brand.Brand;
import com.xworkz.business.company.Company;

public class Tester {
    public static void main(String[] args) {
        Brand brand=new Brand();
        Company company=new Company(brand);
        company.brand.toSell();
    }
}
