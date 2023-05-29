package com.xworkz.movie.tester;

import com.xworkz.movie.Movie;
import com.xworkz.movie.tickets.Tickets;

public class Tester {
    public static void main(String[] args) {
        Tickets tickets=new Tickets();
        Movie movie=new Movie(tickets);
        movie.tickets.toWatchMovies();
    }
}
