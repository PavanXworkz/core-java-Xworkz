package com.xworkz.chatapp;

import java.util.Scanner;

public class ChatTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Chat chat = new Chat();
        for (int index = 0; index < chat.menu.length; index++) {
           // System.err.println("enter the chat name");
            System.out.println("enter the chat name");
            String chatsName = sc.next();
            chat.addItems(chatsName);

        }
        chat.getItems();

    }
}
