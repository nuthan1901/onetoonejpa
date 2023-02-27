package com.oneto.oneto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRep {
	
	@Autowired
	EntityManager entity;
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	public void add() {
		Passport pass=new Passport("F343");
		entity.persist(pass);
		
		Student stu=new Student("amith");
		stu.setPassport(pass);
		entity.persist(stu);
	}
	public void fetch() {
		Student stu=entity.find(Student.class, 11);
		log.info("{}",stu);
		log.info("{}",stu.getPassport());
	}
	public void fetchFindAssociate() {
		Passport pass=entity.find(Passport.class, 100);
		log.info("{}",pass);
		log.info("{}",pass.getStudent());
	}

}
