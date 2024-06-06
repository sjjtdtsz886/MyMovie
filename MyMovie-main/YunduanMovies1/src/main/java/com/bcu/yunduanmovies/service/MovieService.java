package com.bcu.yunduanmovies.service;

import com.bcu.yunduanmovies.domain.Movie;
import com.bcu.yunduanmovies.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieMapper movieMapper;

    @Autowired
    public MovieService(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public List<Movie> getAllMovies() {
        return movieMapper.getAllMovies();
    }

    public Movie getMovieById(int movieId) {
        return movieMapper.getMovieById(movieId);
    }

    public void addMovie(Movie movie) {
        movieMapper.insertMovie(movie);
    }

    public void updateMovie(Movie movie) {
        movieMapper.updateMovie(movie);
    }

    public void deleteMovie(int movieId) {
        movieMapper.deleteMovie(movieId);
    }
}
