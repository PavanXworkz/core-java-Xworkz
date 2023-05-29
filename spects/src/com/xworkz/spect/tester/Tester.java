package com.xworkz.spect.tester;

import com.xworkz.spect.Spects;
import com.xworkz.spect.glass.Glass;

public class Tester {
    public static void main(String[] args) {
        Glass glass=new Glass();
        Spects spects=new Spects(glass);
        spects.glass.clearVesion();
    }
}
