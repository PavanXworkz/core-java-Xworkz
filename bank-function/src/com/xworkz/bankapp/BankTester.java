package com.xworkz.bankapp;

public class BankTester {
    public static void main(String[] args) {
        Bank money = new Bank("Pavan", 23, 82680004986L, "kadur");
        System.out.println("" + money.name + " " + money.age + " " + money.acNo + " " + money.address);

        Bank money1 = new Bank("Dinakar", 22, 339839489095L, "threkere");
        System.out.println("" + money1.name + " " + money1.age + " " + money1.acNo + " " + money1.address);

        Bank money2 = new Bank("Darshan", 23, 1634645542l, "shivni");
        System.out.println("" + money2.name + " " + money2.age + " " + money2.acNo + " " + money2.address);
    }
}
