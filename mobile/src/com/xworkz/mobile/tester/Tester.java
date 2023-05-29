package com.xworkz.mobile.tester;

import com.xworkz.mobile.Mobile;
import com.xworkz.mobile.shope.Shope;

public class Tester {
    public static void main(String[] args) {

        Shope shope=new Shope();
        Mobile mobile=new Mobile(shope);
        mobile.shope.sellMobile();
    }
}
