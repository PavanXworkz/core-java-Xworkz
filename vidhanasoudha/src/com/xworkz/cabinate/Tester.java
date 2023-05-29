package com.xworkz.cabinate;

import com.xworkz.cabinate.paliment.Cabinate;
import com.xworkz.cabinate.vs.VidhanaSoudha;

public class Tester {
    public static void main(String[] args) {
        Cabinate cabinate=new Cabinate();
        VidhanaSoudha soudha=new VidhanaSoudha(cabinate);


        soudha.cabinate.toRun();
    }
}
