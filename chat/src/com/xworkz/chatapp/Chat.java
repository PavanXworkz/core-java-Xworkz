package com.xworkz.chatapp;


public class Chat {
    String menu[] = new String[5];
    int index;
//creating menu
    public  boolean addItems(String chatsName) {
        boolean isAdded = false;
        if (chatsName!= null && index < menu.length) {
           menu[index++]=chatsName;
           isAdded=true;
        }
        else{
            System.out.println("chat name not found");
        }
        return isAdded;
    }
    //read menu
    public void getItems(){
        System.out.println("getting chats");
        for(int index=0;index<menu.length;index++){
            System.out.println(menu[index]);
        }
    }
}
