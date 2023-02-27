package com.oneto.oneto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
@MappedSuperclass
//@Entity
//@NamedQuery(name="fetch_data",query = "select c from Employee c")
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="EmployeeTable")
public abstract class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	
	public Employee() {
		
	}
	public Employee(String name) {
		super();
		
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return name;
	}
	public void setCourse(String name) {
		this.name = name;
	}
	
	
	

}
