package com.xworkz.paytmapp.shopping;

import com.xworkz.paytmapp.Shopping;

public class ShoppingTester {
    public static void main(String[] args) {
        Shopping myAccount=new Shopping();
        myAccount.credit(100000.00);
        System.out.println("my account balance before shopping="+myAccount.getBalance());

        Shopping merchantAccount=new Shopping();
        System.out.println("balance in merchant account before transfer="+merchantAccount.getBalance());
        myAccount.transfer(merchantAccount,1.00);
        System.out.println("balance in merchant account after transfer="+merchantAccount.getBalance());
        System.out.println("my account balance After 1st purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");

        Shopping trends=new Shopping();
        myAccount.transfer(trends,999.00);
        System.out.println("balance in merchant account after transfer="+trends.getBalance());
        System.out.println("my account balance After trends purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");

        Shopping nike=new Shopping();
        myAccount.transfer(nike,8000.00);
        System.out.println("balance in merchant account after transfer="+nike.getBalance());
        System.out.println("my account balance After nike purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");

        Shopping maax=new Shopping();
        myAccount.transfer(maax,15000.00);
        System.out.println("balance in merchant account after transfer="+maax.getBalance());
        System.out.println("my account balance After maax purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");

        Shopping fossil=new Shopping();
        myAccount.transfer(fossil,18000.00);
        System.out.println("balance in merchant account after transfer="+fossil.getBalance());
        System.out.println("my account balance After fossil purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");

        Shopping wrangle=new Shopping();
        myAccount.transfer(wrangle,10999);
        System.out.println("balance in merchant account after transfer="+wrangle.getBalance());
        System.out.println("my account balance After 2nd purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");

        Shopping westSide=new Shopping();
        myAccount.transfer(westSide,3000.00);
        System.out.println("balance in merchant account after transfer="+westSide.getBalance());
        System.out.println("my account balance After 2nd purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");

        Shopping sangeeta=new Shopping();
        myAccount.transfer(sangeeta,25000.00);
        System.out.println("balance in merchant account after transfer="+sangeeta.getBalance());
        System.out.println("my account balance After sangeeta purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");


        Shopping puret=new Shopping();
        myAccount.transfer(puret,9000);
        System.out.println("balance in merchant account after transfer="+puret.getBalance());
        System.out.println("my account balance After puret purchase="+myAccount.getBalance());
        System.out.println("-----------------------------------------------");

    }


    }

