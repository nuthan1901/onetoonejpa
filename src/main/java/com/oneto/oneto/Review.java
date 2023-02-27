package com.oneto.oneto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private int id;
	private String rating;
	private String description;
	@ManyToOne
	private Course course;
	
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Review(String rating ,String description) {
		super();
		
		this.rating = rating;
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Review()
	{
		
	}
	public Review(String description) {
		super();
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return String.format("Student [id=%s, description=%s]", id, description);
	}
	
	
	

}
