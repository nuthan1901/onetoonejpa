//package com.oneto.oneto;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.jayway.jsonpath.Predicate;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.Query;
//import jakarta.persistence.TypedQuery;
//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Join;
//import jakarta.persistence.criteria.JoinType;
//import jakarta.persistence.criteria.Root;
//import jakarta.transaction.Transactional;
//
//@SpringBootTest(classes=OnetoApplication.class)
//class OnetoApplicationTests {
//	@Autowired
//	EntityManager entity;
//	
//	@Autowired
//	EmployeeRep rep;
//	private Logger log=LoggerFactory.getLogger(this.getClass());
//
//	@Test
//	@Transactional
//	void demo() {
//		Course course=entity.find(Course.class, 301);
//		log.info("{}",course);
//		log.info("{}",course.getReview());
//	}
//	@Test
//	
//	void jpqlbasic() {
//		CriteriaBuilder cb=entity.getCriteriaBuilder();
//		CriteriaQuery cq=cb.createQuery(Course.class);
//		
//		
//		Root<Course> courseRoot=cq.from(Course.class);
//		TypedQuery<Course> query=entity.createQuery(cq.select(courseRoot));
//		
//		List<Course> result=query.getResultList();
//		log.info("{}",result);
//		
//	}
//	@Test
//	void jpql_test() {
//		CriteriaBuilder cb=entity.getCriteriaBuilder();
//		
//		CriteriaQuery cq=cb.createQuery(Course.class);
//		
//		
//		
//		Root<Course> courseRoot=cq.from(Course.class);
//		jakarta.persistence.criteria.Predicate student=cb.isEmpty(courseRoot.get("student"));
//		cq.where(student);
//		TypedQuery<Course> query=entity.createQuery(cq.select(courseRoot));
//		List<Course> result=query.getResultList();
//		log.info("hjghjuig{}",result);
//		
//	}
//	@Test
//	public void jpql_studentwithout() {
//		CriteriaBuilder cb=entity.getCriteriaBuilder();
//		CriteriaQuery<Course> cq=cb.createQuery(Course.class);
//		
//		Root<Course> root=cq.from(Course.class);
//		jakarta.persistence.criteria.Predicate pr=cb.isEmpty(root.get("student"));
//		cq.where(pr);
//		
//		
//		TypedQuery<Course> query=entity.createQuery(cq.select(root));
//		List<Course> list=query.getResultList();
//		log.info("{}",list);
//		
//	}
//	@Test
//	public void jpql_joins() {
//		CriteriaBuilder cb=entity.getCriteriaBuilder();
//		CriteriaQuery<Course> cq=cb.createQuery(Course.class);
//		
//		Root<Course> root=cq.from(Course.class);
//		Join<Object,Object> object=root.join("student",JoinType.LEFT);
//		
//		TypedQuery<Course> query=entity.createQuery(cq.select(root));
//		List<Course> course=query.getResultList();
//		log.info("data {}",course);
//	}
//
//}
