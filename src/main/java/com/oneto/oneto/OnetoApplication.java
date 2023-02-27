package com.oneto.oneto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnetoApplication implements CommandLineRunner {
	@Autowired
	StudentRep rep;
	
	@Autowired
	EmployeeRep erep;
	
	@Autowired
	CourseRep crep;
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(OnetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//		rep.add();
//		rep.fetch();
//		rep.fetchFindAssociate();
		List<Review> review=new ArrayList<>();
		review.add(new Review("4","good"));
		review.add(new Review("3","not bad"));
		
		
//		crep.add();
//		crep.generalizing(302,review);
//		
//		crep.addreviewForCourse();
		
//		erep.insert(new FullTimeEmployee("nuthan",new BigDecimal(10000)));
//		erep.insert(new PartTimeEmployee("kushal",new BigDecimal(50)));
//		
//		log.info("{}",erep.FullTime());
//		log.info("{}",erep.partTime());
		
//		erep.jpql();
//		erep.jpqlWithAtleastTwoStudent();
//		erep.jpqlUisngLike();
//		erep.JpqlJoins();
//		erep.Jpql_Left_Joins();
		
		
	}

}
