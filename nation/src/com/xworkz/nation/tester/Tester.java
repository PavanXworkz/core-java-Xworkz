package com.xworkz.nation.tester;

import com.xworkz.nation.Nation;
import com.xworkz.nation.states.States;

public class Tester {
    public static void main(String[] args) {
        States states=new States();
        Nation nation=new Nation();
        nation.states=states;
        nation.states.collectTax();
    }
}
