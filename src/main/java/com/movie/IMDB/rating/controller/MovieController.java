package com.movie.IMDB.rating.controller;

import com.movie.IMDB.rating.model.Movie;
import com.movie.IMDB.rating.repository.MovieRepository;
import com.movie.IMDB.rating.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imdb")
public class MovieController {
    private MovieService movieService;
    @Autowired
    public MovieController(MovieService service)// It is helping us to add movierepository to moviecontroller.
    {
        this.movieService=service; // Creating dependency and wire it.
    }
//@Controller
//public class MovieController {
//
//    //this annotation is used to autowire MovieRepository with MovieContoller
//    //(this is dependency/ "Dependency Injection")
//    @Autowired
//    MovieRepository movieRepository;
    //Calling Movie Repository Constructor

    //Here we are using logic/function of CRUD Repository in movieRepository
    //GetMapping is used to map on database


    @PostMapping("/movies/save") // Spring Boot is mapping
    public String saveMovie(@RequestBody Movie payload)
    {
        return movieService.saveMovie(payload);
    }
    // Here we are using the logic of the crud repository in movie repository.
    @GetMapping("/movies")
    public List<Movie> movieList() {
        return movieService.getMovieList();
    }


    @GetMapping("/movies/{id}")
    public Movie movieById(@PathVariable("id") int id) {
        return movieService.getMovieById(id);
    }

    @RequestMapping("/movies/delete/{id}")
    public Movie movieDeleteById(@PathVariable ("id") int id) {
        return movieService.deleteMovieById(id);
    }

    //method=Requestmethod.GET retricts it to only GET request
    @RequestMapping(value="/movies/count", method = RequestMethod.GET)
    public long movieCount() {
        return movieService.countMovie();
    }



}
