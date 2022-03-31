package com.vinappstudio.movielist;

import org.json.JSONArray;

import java.lang.reflect.Array;

public class Movie {
    private String title , poster,overview;
    private Double rating;
    //private JSONArray genres;

    public Movie(String title, String poster, String overview, Double rating) {
        this.title = title;
        this.poster = poster;
        this.overview = overview;
        this.rating = rating;
       // this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster() {
        return poster;
    }

    public String getOverview() {
        return overview;
    }

    public Double getRating() {
        return rating;
    }

//    public JSONArray getGenres() {
//
//        return genres;
//    }
}
