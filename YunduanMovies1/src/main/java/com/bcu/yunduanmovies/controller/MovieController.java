package com.bcu.yunduanmovies.controller;

import com.bcu.yunduanmovies.domain.Movie;
import com.bcu.yunduanmovies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // 获取所有电影
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    // 获取特定电影
    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable int movieId) {
        return movieService.getMovieById(movieId);
    }

    // 添加新电影
    @PostMapping
    public String addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
        return "Movie added successfully";
    }

    // 更新电影信息
    @PutMapping
    public String updateMovie(@RequestBody Movie movie) {
        movieService.updateMovie(movie);
        return "Movie updated successfully";
    }

    // 删除电影
    @DeleteMapping("/{movieId}")
    public String deleteMovie(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
        return "Movie deleted successfully";
    }
}
