package com.xworkz.cakeapp;

public class CakeTester {

    public static void main(String[] args) {

        Cake eat = new Cake("Circle", "Red", "Cherry", 365.00);
        System.out.println("Shape is=" + eat.shape + "\n Cake color=" + eat.color + "\n cake flaver" + eat.flaver + "\n cake price=" + eat.price);

        Cake eat1 = new Cake("Square", "yellow", "pinaple", 655.00);
        System.out.println("shape is=" + eat1.shape + "Cake colour=" + eat1.color + "cake flaver=" + eat1.flaver + "price=" + eat1.price);
    }
}
