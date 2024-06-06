package com.bcu.yunduanmovies.domain;



import java.util.Date;


public class Movie {


    private int movieId;


    private String movieTitle;


    private String movieDescription;


    private String movieGenre;

    private Date movieDate;


    private String movieRegion;


    private int movieRating;

    public int getMovieMemberNeed() {
        return movieMemberNeed;
    }

    public void setMovieMemberNeed(int movieMemberNeed) {
        this.movieMemberNeed = movieMemberNeed;
    }

    private int movieMemberNeed;



    // Getters and Setters

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public String getMovieRegion() {
        return movieRegion;
    }

    public void setMovieRegion(String movieRegion) {
        this.movieRegion = movieRegion;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }
}