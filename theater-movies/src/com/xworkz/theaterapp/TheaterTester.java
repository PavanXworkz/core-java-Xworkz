package com.xworkz.theaterapp;

import java.util.Scanner;

public class TheaterTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Theater theater=new Theater();
        for(int i=0;i<theater.moviesName.length;i++){
            System.out.println("enter the movie mane");
            String movieName=sc.next();
            theater.moviesName(movieName);
        }
        theater.getMoviesName();
    }
}
