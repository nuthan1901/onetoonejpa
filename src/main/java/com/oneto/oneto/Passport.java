package com.oneto.oneto;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	@GeneratedValue
	private int id;
	private String number;
	public Passport() {
		super();
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "passport")
	private Student student;
	public Passport(String number) {
		super();
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return number;
	}
	public void setName(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Passport [number=" + number + "]";
	}
	
	
	
	
	

}
