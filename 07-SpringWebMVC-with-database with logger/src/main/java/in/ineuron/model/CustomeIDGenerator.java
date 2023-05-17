//package in.ineuron.model;
//
//import java.util.List;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CustomeIDGenerator {
//
//	@Autowired
//	private SessionFactory sessionFactory;
//	
//	public Long getCustomeId() {
//		
//		Session session = sessionFactory.getCurrentSession();
////		
////		CriteriaBuilder builder = session.getCriteriaBuilder();
////		
////	
////		CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
////		Root<Employee> root = criteriaQuery.from(Employee.class);
////		criteriaQuery.select(root);
////		
////		criteriaQuery.select(root);
////	    Query<Employee> query = session.createQuery(criteriaQuery);
////
////		List<Employee> list = query.list();
//		
//		
//		Query<Employee> query = session.createQuery("SELECT S.roll FROM Student S");
//		
//         List<Employee> list = query.list();
////		
//		return null;
//	}
//	
//	
//	
//}
