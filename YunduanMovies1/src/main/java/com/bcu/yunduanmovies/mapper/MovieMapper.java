package com.bcu.yunduanmovies.mapper;

import com.bcu.yunduanmovies.domain.Movie;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MovieMapper {

    @Select("SELECT * FROM t_movie")
    List<Movie> getAllMovies();

    @Select("SELECT * FROM t_movie WHERE movie_id = #{movieId}")
    Movie getMovieById(int movieId);

    @Insert("INSERT INTO t_movie(movie_title, movie_description, movie_genre, movie_date, movie_region, movie_rating, movie_memberneed) " +
            "VALUES(#{movieTitle}, #{movieDescription}, #{movieGenre}, #{movieDate}, #{movieRegion}, #{movieRating}, #{movieMemberneed})")
    void insertMovie(Movie movie);

    @Update("UPDATE t_movie SET movie_title = #{movieTitle}, movie_description = #{movieDescription}, " +
            "movie_genre = #{movieGenre}, movie_date = #{movieDate}, movie_region = #{movieRegion}, " +
            "movie_rating = #{movieRating}, movie_memberneed = #{movieMemberneed} WHERE movie_id = #{movieId}")
    void updateMovie(Movie movie);

    @Delete("DELETE FROM t_movie WHERE movie_id = #{movieId}")
    void deleteMovie(int movieId);
}
