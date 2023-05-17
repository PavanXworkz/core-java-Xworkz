package com.xworkz.restorentapp;

public class Restorent {
     String menu[]=new String[5];
     int index;
    public  boolean addItems(String foodName)
    {
        boolean isAdded=false;
        if(menu!=null && index<menu.length)
        {
            menu[index++]=foodName;
            isAdded=true;
        }
        else
        {
            System.out.println("food name not found"+foodName);
        }
        return isAdded;
    }
    public  void getItems()
    {
        for(int i=0;i<menu.length;i++)
        {
            System.out.println(menu[i]);
        }
        System.out.println("----length fool----");
    }
}
