package com.xworkz.footwareapp;

import java.util.Scanner;

public class FootWareTester {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter product id");
        int productId = sc.nextInt();
        System.out.println("enter the brand name");
        String brandName = sc.next();
        System.out.println("enter the size");
        int size = sc.nextInt();
        System.out.println("enter which type");
        String type = sc.next();
        System.out.println("enter the price");
        double prize = sc.nextDouble();
        System.out.println("type of material");
        String materialType = sc.next();

        FootWare ware = new FootWare();
        ware.setProductId(productId);
        ware.setBrandName(brandName);
        ware.setSize(size);
        ware.setType(type);
        ware.setPrize(prize);
        ware.setMaterialType(materialType);
        System.out.println(ware.getProductId()+"\n"+ware.getBrandName()+"\n"+ ware.getSize()+"\n"+ ware.getSize()+"\n"+ware.getPrize()+"\n"+ware.getMaterialType());
    }
}