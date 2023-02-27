package com.oneto.oneto;

import java.util.List;import org.hibernate.usertype.internal.AbstractTimeZoneStorageCompositeUserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseRep {
	@Autowired
	EntityManager entity;
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	public void addreviewForCourse() {
		// TODO Auto-generated method stub
		Student stu=entity.find(Student.class, 1);
		log.info("{}",stu);
		log.info("{}",stu.getCourse());
	}
	public void add() {
		Course course=new Course("finite Automataa");
		entity.persist(course);
		
		Review r1=new Review ("2 ","not good");
		course.addReview(r1);
		r1.setCourse(course);
		entity.persist(r1);
		
		
	}
	public void generalizing(int courseId,List<Review> review) {
		Course course=entity.find(Course.class, courseId);
		
		for(Review reviews:review) {
		
		course.addReview(reviews);
		reviews.setCourse(course);
		entity.persist(reviews);
		}
	}
	public void HardCoding(Student stu,Course course) {
//		Student stu=new Student("sharanya");
//		Course course=entity.find(Course.class, 302);
		
		entity.persist(course);
		entity.persist(stu);
		
		
		stu.addCourse(course);
		course.addStudent(stu);
		entity.persist(stu);
		
	}

}
