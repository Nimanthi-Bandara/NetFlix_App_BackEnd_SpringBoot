package com.Springboot.NetflixApp.Services;

import com.Springboot.NetflixApp.Entity.Movie;

import java.util.List;

public interface MovieService {
    Movie createMovie(Movie movie);
    List<Movie> getAllMovies();
    List<Movie> searchMovies(String title);
    void deleteMovie(Long id);

    void deleteAllMovies();

}
