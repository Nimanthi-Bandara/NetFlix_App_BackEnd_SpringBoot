package com.Springboot.NetflixApp.Services;

import com.Springboot.NetflixApp.Entity.Movie;
import com.Springboot.NetflixApp.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieImp implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie createMovie(Movie movie) {

        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {

        return movieRepository.findAll();
    }

    @Override
    public List<Movie> searchMovies(String title) {

        return movieRepository.findByTitleContaining(title);
    }

    @Override
    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }


    @Override
    public void deleteAllMovies(){
        movieRepository.truncateTable();
    }
}

