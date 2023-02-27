package com.oneto.oneto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private String course;
	@OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
	private List<Review> review=new ArrayList<>();
	@ManyToMany(mappedBy = "course")
	private List<Student> student=new ArrayList<>();
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public void removeReview(Review review) {
		this.review.remove(review);
	}
	public List<Review> getReview() {
		return review;
	}
	public void addStudent(Student student) {
		this.student.add(student);
	}
	public void removeStudent(Student student) {
		this.student.remove(student);
	}
	
	public void addReview(Review review) {
		this.review.add(review);
	}
	public Course() {
		
	}
	public Course(String course) {
		super();
		
		this.course = course;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	

}
