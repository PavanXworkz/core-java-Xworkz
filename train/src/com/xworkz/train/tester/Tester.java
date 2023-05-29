package com.xworkz.train.tester;

import com.xworkz.train.Train;
import com.xworkz.train.compatment.Compartment;

public class Tester {
    public static void main(String[] args) {


        Compartment compartment = new Compartment();
        Train train = new Train(compartment);
        train.compartment.toSit();
    }
}
