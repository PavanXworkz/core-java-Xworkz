package com.xworkz.roti;

public class RotiRunner {
    public static void main(String[] args) {

        Roti roti=new Roti();
        roti.rotiLength();

        RagiRoti ragiRoti=new RagiRoti();
        ragiRoti.ragiRoti();
        ragiRoti.rotiLength();

        Roti roti1=new RagiRoti();
        roti1.rotiLength();

        OnionMasalaRagiRoti roti2=new OnionMasalaRagiRoti();
        roti2.onionMasalaRagiroti();

        OnionRagiRoti roti3=new OnionMasalaRagiRoti();
        roti3.onionRagiRoti();


        Kulcha kulcha=new Kulcha();
        kulcha.kulcha();


    }
}
