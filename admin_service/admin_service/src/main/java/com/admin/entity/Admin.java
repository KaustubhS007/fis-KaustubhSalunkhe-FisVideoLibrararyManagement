package com.admin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin{
	
	@Id
	int mid;
	
	String movie_name;
	
	int release_year;
	
	
	String language;
	
	int rating;
	
	int duration_in_mins;
	
	String movie_type;
	
	String movie_category;
	
	String director_name;
	
	String lead_actor1;
	
	String lead_actor2;
	
	int rental_cost;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int mid, String movie_name, int release_year, String language, int rating, int duration_in_mins,
			String movie_type, String movie_category, String director_name, String lead_actor1, String lead_actor2,
			int rental_cost) {
		super();
		this.mid = mid;
		this.movie_name = movie_name;
		this.release_year = release_year;
		this.language = language;
		this.rating = rating;
		this.duration_in_mins = duration_in_mins;
		this.movie_type = movie_type;
		this.movie_category = movie_category;
		this.director_name = director_name;
		this.lead_actor1 = lead_actor1;
		this.lead_actor2 = lead_actor2;
		this.rental_cost = rental_cost;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getDuration_in_mins() {
		return duration_in_mins;
	}

	public void setDuration_in_mins(int duration_in_mins) {
		this.duration_in_mins = duration_in_mins;
	}

	public String getMovie_type() {
		return movie_type;
	}

	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}

	public String getMovie_category() {
		return movie_category;
	}

	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public String getLead_actor1() {
		return lead_actor1;
	}

	public void setLead_actor1(String lead_actor1) {
		this.lead_actor1 = lead_actor1;
	}

	public String getLead_actor2() {
		return lead_actor2;
	}

	public void setLead_actor2(String lead_actor2) {
		this.lead_actor2 = lead_actor2;
	}

	public int getRental_cost() {
		return rental_cost;
	}

	public void setRental_cost(int rental_cost) {
		this.rental_cost = rental_cost;
	}
	
	
	
	
}