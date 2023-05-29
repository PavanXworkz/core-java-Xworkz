package com.xworkz.mall;

import com.xworkz.mall.shop.ShopName;
import com.xworkz.mall.stall.Mall;

public class Tester {


    public static void main(String[] args) {
        ShopName name=new ShopName();
        Mall mall=new Mall(name);
        //Mall mall=new Mall();
        //mall.name=name;
        mall.name.doBusiness();
    }
}
