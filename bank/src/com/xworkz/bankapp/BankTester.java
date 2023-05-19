package com.xworkz.bankapp;

import java.util.Scanner;

public class BankTester {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bank id");
        int id= sc.nextInt();
        System.out.println("enter the account number");
        long accountNo= sc.nextLong();
        System.out.println("enter the branch number");
        int branchNo= sc.nextInt();
        System.out.println("enter the account type");
        String accountType=sc.next();
        System.out.println("enter the ifsc code");
        String ifscCode=sc.next();
        System.out.println("enter the bank location");
        String location=sc.next();




        Bank bank=new Bank();
        bank.setId(id);
        bank.setAccountNo(accountNo);
        bank.setBranchNo(branchNo);
        bank.setAccountType(accountType);
        bank.setIfscCode(ifscCode);
        bank.setLocation(location);

        System.out.println(bank.getId()+"\n"+bank.getAccountNo()+"\n"+bank.getBranchNo()+"\n"+bank.getAccountType()+"\n"+bank.getIfscCode()+"\n"+bank.getLocation());
    }
}
