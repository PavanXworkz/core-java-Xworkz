package com.xworkz.restorentapp;

import java.util.Scanner;

public class RestorentTester {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Restorent restorent=new Restorent();
        for(int i=0;i<restorent.menu.length;i++){
            System.out.println("enter item name");
            String foodName=sc.next();
            restorent.addItems(foodName);
        }
        restorent.getItems();
    }
}
