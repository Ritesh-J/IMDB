package com.movie.IMDB.rating.service;


import com.movie.IMDB.rating.model.Movie;
import com.movie.IMDB.rating.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
@Service
public class MovieService {
    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }




    //Instead of String we could have used List<Movie> as return type od saveMovie()
    public String saveMovie(Movie movie){
        Movie savedMovie = movieRepository.save(movie);
        return "New Movie Created: " + savedMovie;
    }
    public List<Movie> getMovieList() {
        return movieRepository.findAll();
    }
    public Movie getMovieById( int id) {
        return movieRepository.findById(id);
    }
    public Movie deleteMovieById(int id) {
        return movieRepository.deleteById(id);
    }

    public long countMovie() {
        return movieRepository.count();
    }



}
