package com.movie.IMDB.rating;

//Creating a Movie class to store movieName, movieId, movieDescription
public class Movie {
    private int id;
    private String movieName;
    private String movieDescription;

    //Constructor to assign variables
    public Movie(String movieName, String movieDescription, int id){
        //this keyword is used to assign local variables of class to the  value of parameters
        this.id=id;
        this.movieName=movieName;
        this.movieDescription=movieDescription;
    }
    //Creating getter and setter for all the 3 variables
    public Integer getId(){
        return id;
    }
    public String getMovieName(){
        return movieName;
    }
    public String getMovieDescription() {
        return movieDescription;
    }
    public void setId(Integer id) {
        this.id=id;
    }
    public void setMovieName(String movieName) {
        this.movieName=movieName;
    }
    public void setMovieDescription(String movieDescription) {
        this.movieDescription=movieDescription;

    }

}
