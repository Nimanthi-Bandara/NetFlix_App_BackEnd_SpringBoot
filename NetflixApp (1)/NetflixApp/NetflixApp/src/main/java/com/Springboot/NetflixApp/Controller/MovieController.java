package com.Springboot.NetflixApp.Controller;

import com.Springboot.NetflixApp.Entity.Movie;
import com.Springboot.NetflixApp.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies() {

        return movieService.getAllMovies();
    }

    @PostMapping("/addMovie")
    public Movie createMovie(@RequestBody Movie movie) {

        return movieService.createMovie(movie);
    }

    @GetMapping("/search")
    public List<Movie> searchMovies(@RequestParam String title) {

        return movieService.searchMovies(title);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllMovies(){
        movieService.deleteAllMovies();
    }
}

