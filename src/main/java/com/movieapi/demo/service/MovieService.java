package com.movieapi.demo.service;
import java.util.*;

import org.springframework.stereotype.Service;

import com.movieapi.demo.model.Movie;

@Service
public class MovieService {

	private  ArrayList <Movie> movies =  new ArrayList<>();
	
	private Long idCounter = 1L;
	
	public Movie addMovie( Movie movie)
	{
		movie.setId(idCounter++);
		movies.add(movie);
		return movie;
	}
	
	public Optional<Movie>  getMovieByid(Long id) {
		return  movies.stream()
				.filter(movie -> movie.getId().equals(id))
				.findFirst();
		
	}
	
	public List<Movie>getAllMovies()
	{
		return movies;
	}
	
}
