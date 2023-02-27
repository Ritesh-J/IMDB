//This Class is Movie Entity
package com.movie.IMDB.rating.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//This is the Entity for the SpringBoot
@Entity
//Creating a Movie class to store movieName, movieId, movieDescription
public class Movie {
    @Id //When we specify this line the variable "id" becomes primary key (autogenration of id)
    @GeneratedValue(strategy = GenerationType.AUTO) //Here the value of id is generated automatically from 0 to 1,2,3,
    private int id;
    private String movieName;
    private String movieDescription;

    //here we converted to JSON format object
    //This can be done by right Click>generate>toString
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                '}';
    }

    //this constructor without parameters are called default constructor
    //it is automatically generated nowadays
    public Movie() {
        this.id=0;
        this.movieDescription="";
        this.movieName="";

    }

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
