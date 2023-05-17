package com.xworkz.mobileapp;

import java.util.Scanner;

public class MobileTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile phone = new Mobile();
        for (int i = 0; i < phone.mobileNames.length; i++) {
            System.out.println("Enter the mobile name");
            String addMobileName = sc.next();
            phone.addMobileName(addMobileName);
        }
        phone.getMobileNames();
    }
}
