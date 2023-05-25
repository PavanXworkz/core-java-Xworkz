package com.xworkz.paytmapp;

import com.xworkz.paytmapp.account.SavingsAccount;

public class Shopping {
    private double balance;


    public void credit(double amount) {
        balance += amount;
    }

    public double debit(double amount) {
        balance -= amount;
        return  amount;
    }
    public double getBalance() {
        return balance;
    }


    //transfer
    public void transfer(Shopping shoppingAccount, double amount){
        this.debit(amount);
        shoppingAccount.credit(amount);

    }

}
