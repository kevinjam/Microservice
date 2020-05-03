package com.kevinjanvier.movieinfoservice.models;

public class Movie {
    private String movieId;
    private String name;
    private String movieSummary;

    public Movie(String movieId, String name, String movieSummary) {
        this.movieId = movieId;
        this.name = name;
        this.movieSummary = movieSummary;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieSummary() {
        return movieSummary;
    }

    public void setMovieSummary(String movieSummary) {
        this.movieSummary = movieSummary;
    }
}
