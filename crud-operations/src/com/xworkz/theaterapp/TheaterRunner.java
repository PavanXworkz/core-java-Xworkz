package com.xworkz.theaterapp;

public class TheaterRunner {


    public static void main(String[] muv) {
        System.out.println("main method started");
        Theater.moviesName("kantara");
        Theater.moviesName("gaja");
        Theater.moviesName("kgf");
        Theater.moviesName("ps1");
        Theater.moviesName("master");
        Theater.moviesName("hoysala");
        Theater.moviesName("karanti");
        Theater.moviesName("kk");
        Theater.moviesName("navagraha");
        Theater.moviesName("kabza");
        Theater.moviesName("avatar");

        Theater.getMoviesName();
        Theater.updateMoviesName("gaja", "boos");
        Theater.getMoviesName();
        String isPresent = Theater.getMovieName("master");
        System.out.println("movie name found :" + isPresent);
        System.out.println("main method ended");


    }


}
