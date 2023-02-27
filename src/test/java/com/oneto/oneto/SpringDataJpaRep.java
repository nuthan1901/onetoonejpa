//package com.oneto.oneto;
//import java.util.Optional;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import jakarta.persistence.EntityManager;
//@SpringBootTest(classes=OnetoApplication.class)
//class SpringDataJpaRep {
//	private Logger logger=LoggerFactory.getLogger(this.getClass());
//	
//	@Autowired
//	CourseSprindDataRep crp;
//	
//	@Autowired
//	EntityManager em;
//	
//	@Test
//	public void findbyId() {
// Optional<Course> cou=crp.findById(1001);
// //assertTrue(cou.isPresent());
// logger.info("is present:{}",cou.isPresent());
//	}
//	@Test
//	public void findbyIdnotPresent() {
// Optional<Course> cou=crp.findById(1005);
// //assertFalse(cou.isPresent());	
// logger.info("is not present:{}",cou.isPresent());
//	}
//	
//	@Test
//	public void CrudMethod()
//	{
// Course c=new Course("NT");
// crp.save(c);
// c.setCourse("Data Mining");
// crp.save(c);
// logger.info("find all courses{}",crp.findAll());
// logger.info("Count all courses{}",crp.count());
//	}
//	//sorting example
//	@Test
//	public void sortexample()
//	{
// logger.info("{}",crp.findAll(Sort.by(Sort.Direction.ASC, "name")));
//	}
//	
//	//pagination
//	@Test
//	public void paginationexample() {
// PageRequest pr=PageRequest.of(0,3);
// Page<Course> FP=(Page<Course>) crp.findAll(pr);
// logger.info(" 1st pagination example{}",FP.getContent());
// 
// 
// org.springframework.data.domain.Pageable secondpagable=FP.nextPageable();
// Page<Course> secondpage=crp.findAll(secondpagable);
// logger.info(" 2nd pagination example{}",secondpage.getContent());
// 
// 
// org.springframework.data.domain.Pageable Thirdpagable=secondpage.nextPageable();
// Page<Course> Thirdpage=crp.findAll(Thirdpagable);
// logger.info(" 3rd pagination example{}",Thirdpage.getContent());
// 
// 
// org.springframework.data.domain.Pageable fourthpagable=Thirdpagable.next();
// Page<Course> fourthpage=crp.findAll(fourthpagable);
// logger.info(" 4th pagination example{}",fourthpage.getContent());
//	}
//	
//}