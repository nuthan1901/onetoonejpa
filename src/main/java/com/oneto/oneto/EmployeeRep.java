package com.oneto.oneto;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRep {
	
	@Autowired
	EntityManager entity;
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	public void insert(Employee employee) {
		entity.persist(employee);
	}
	public List<Employee> partTime(){
		TypedQuery<Employee> query=entity.createQuery("select c from PartTimeEmployee c", Employee.class);
		return query.getResultList();
	}
	public List<Employee> FullTime(){
		TypedQuery<Employee> query=entity.createQuery("select c from FullTimeEmployee c", Employee.class);
		return query.getResultList();
	}
	public void jpql() {
		TypedQuery<Course> query=entity.createQuery("select c from Course c where c.student is empty ",Course.class);
		List<Course> result=query.getResultList();
		log.info("{}",result);
	}
	public void jpqlWithAtleastTwoStudent() {
		TypedQuery<Course> query=entity.createQuery("select c from Course c order by size(c.student) desc",Course.class);
		List<Course> result=query.getResultList();
		log.info("{}",result);
	}
	public void jpqlUisngLike() {
		TypedQuery<Student> query=entity.createQuery("select s from Student s where s.passport.number like '%2%' ",Student.class);
		List<Student> result=query.getResultList();
		log.info("{}",result);
	}
	public void JpqlJoins() {
		Query query=entity.createQuery("select c,s from Course c join c.student s ");
		List<Object[]> result=query.getResultList();
		log.info("{}",result.size());
		for(Object[] results:result) {
			log.info("{},{}",results[0],results[1]);
			
			
		}
	}
	public void Jpql_Left_Joins() {
		Query query=entity.createQuery("select c, s from Course c, Student s ");
		List<Object[]> result=query.getResultList();
		log.info("{}",result.size());
		for(Object[] results:result) {
			log.info("{},{}",results[0],results[1]);
			
			
		}
	}
	
	
}
