package com.Springboot.NetflixApp.Services;

import com.Springboot.NetflixApp.Entity.Movie;
import com.Springboot.NetflixApp.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

    @Service
    public class StreamImp implements StreamingService {

        @Autowired
        private MovieRepository movieRepository;

        @Override
        public String streamMovie(Long movieId) {
            Optional<Movie> movie = movieRepository.findById(movieId);
            if (movie.isPresent()) {
                return "Streaming content for movie: " + movie.get().getTitle();
            } else {
                return "Movie not found!";
            }
        }
    }
