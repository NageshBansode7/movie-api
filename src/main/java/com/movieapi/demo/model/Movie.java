package com.movieapi.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Movie {
	
	
	private  Long id;
	
	
	
	@NotBlank(message =" Movie Name is required")
	@Size(min = 2, message = "Movie name must have at least 2 characters")
private String name;

	
	@NotBlank(message="Description is required")
private String description;

	@NotNull(message = " Rating is required")
private Double rating;


public Movie(){
	
}


public Movie(Long id,
		@NotBlank(message = " Movie Name is required") @Size(min = 2, message = "Movie name must have at least 2 characters") String name,
		@NotBlank(message = "Description is required") String description,
		@NotNull(message = " Rating is required") Double rating) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.rating = rating;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public Double getRating() {
	return rating;
}


public void setRating(Double rating) {
	this.rating = rating;
}




}
