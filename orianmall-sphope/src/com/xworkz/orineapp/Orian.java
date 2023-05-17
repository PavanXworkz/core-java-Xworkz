package com.xworkz.orineapp;

public class Orian {
     String[] shopNames = new String[5];

     int index;

    // add - create - save (operations)
    public  boolean addShopName(String shopName)
    {
        System.out.println("addShopName method started");
        System.out.println("Type of parameter is string: " + shopName);
        boolean isAdded = false;
        if (shopName != null)
        {
            shopNames[index++] = shopName;
            isAdded = true;
        }
        else
        {
            System.out.println("------Invalid argument------");
        }
        System.out.println("addShopName method ended");
        return isAdded;
    }

    // get - read - fetch (operations)
    public  void getShopName()
    {
        System.out.println("getShopName method started");
        for (int i = 0; i < shopNames.length; i++)
        {
            System.out.println(shopNames[i]);
        }
        System.out.println("getShopName method ended");
    }

}
