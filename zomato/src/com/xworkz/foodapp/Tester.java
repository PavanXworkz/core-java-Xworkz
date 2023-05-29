package com.xworkz.foodapp;

import com.xworkz.foodapp.boys.DelevaryBoys;
import com.xworkz.foodapp.zomato.Zomato;

public class Tester {

    public static void main(String[] args) {
        DelevaryBoys boys=new DelevaryBoys();
        Zomato zomato=new  Zomato(boys);
        zomato.boys.boys();
    }
}
