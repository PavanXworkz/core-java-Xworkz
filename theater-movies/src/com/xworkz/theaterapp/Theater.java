package com.xworkz.theaterapp;

public class Theater {
    String moviesName[] = new String[5];
    int index;

    public  boolean moviesName(String movieName) {
        System.out.println("movie name adding started");
        boolean isAdded = false;
        if (movieName != null && index < moviesName.length) {
            moviesName[index++] = movieName;
            isAdded = true;
        } else {
            System.out.println("movie name not found" + moviesName);
        }
        System.out.println("movie name adding ended");
        return isAdded;

    }

    public void getMoviesName() {
        System.out.println("get method started");
        for (int i = 0; i < moviesName.length; i++) {
            System.out.println(moviesName[i]);
        }
        System.out.println("get method ended");

    }
}
