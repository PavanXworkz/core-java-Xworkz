package com.xworkz.teaapp;

public class TeaShope {
    String[] teaNames = new String[5];
    int index;

    // add - create - save (operations)
    public boolean addTeaName(String teaName) {

        boolean isAdded = false;
        if (teaName != null) {
            if (index < teaNames.length) {
                teaNames[index++] = teaName;
                isAdded = true;
            } else {
                System.out.println("-------Array is full-------");
            }
        }
        return isAdded;
    }

    // get - read - fetch (operations)
    public void getTeaName() {
        for (int i = 0; i < teaNames.length; i++) {
            System.out.println(teaNames[i]);
        }
    }
}
