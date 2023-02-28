package com.movie.IMDB.rating.repository;

import com.movie.IMDB.rating.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//We are extending MovieRepository with CRUD Repository & giving type genric od Movie class, Integer-Primary key
@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {
    //findAll() is a general function we are using it from CrudRepository interface
    public List<Movie> findAll();
    public Movie findById(int id);
    public Movie save(Movie movie);
    public Movie deleteById(int id);
    public long count();



}
