package com.xworkz.mobileapp;

public class Mobile {
    String mobileNames[] = new String[5];
    int index;
//adding
    public boolean addMobileName(String mobileName) {
        boolean isAdd = false;
        if (mobileNames != null && index < mobileNames.length) {
            mobileNames[index++] = mobileName;
            isAdd = true;
        } else {
            System.out.println("name of the mobile not found" );
        }
        return isAdd;
    }
//reading
    public void getMobileNames() {
        System.out.println("------get mobile name method started-----");
        for (int i = 0; i < mobileNames.length; i++) {
            System.out.println(mobileNames[i]);
        }
    }
}
