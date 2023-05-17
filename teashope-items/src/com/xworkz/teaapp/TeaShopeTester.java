package com.xworkz.teaapp;

import java.util.Scanner;

public class TeaShopeTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TeaShope teaShope=new TeaShope();
        for (int i=0;i<teaShope.teaNames.length;i++){
            System.out.println("Enter the tea name");
            String addTeaName=sc.next();
            teaShope.addTeaName(addTeaName);
        }
        teaShope.getTeaName();
    }
}
