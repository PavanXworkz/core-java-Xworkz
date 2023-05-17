package com.xworkz.orineapp;

import java.util.Scanner;

public class OrianTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Orian orian = new Orian();
        for (int i = 0; i < orian.shopNames.length; i++) {


            System.out.println("enter the shope name");
            String shopName = sc.next();
            orian.addShopName(shopName);
        }
        orian.getShopName();
    }
}
