package com.xworkz.factory;

import com.xworkz.factory.machines.Factory;
import com.xworkz.factory.machines.Machines;

public class Tester {

    public static void main(String[] args) {

        Machines machines=new Machines();
        Factory factory=new Factory(machines);
        factory.machines.toWork();
    }
}
