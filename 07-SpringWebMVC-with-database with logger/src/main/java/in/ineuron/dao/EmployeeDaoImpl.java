package in.ineuron.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.model.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Override
	public Long saveEmployeeDetails(Employee employee) {

		Long id = null;

		Session session = null;

		try {
			session = sessionFactory.getCurrentSession();
			logger.debug("Session Established Seccessfully");
			logger.info("Coonection established bro");

			id = (Long) session.save(employee);

		} catch (HibernateException e) {
			logger.error("Exception occure by Hibernate ----> " + e.getMessage());
		} catch (Exception e) {
			logger.error("Exception occure inside Exceotion Class ----> " + e.getMessage());
		}

		return id;
	}

	@Override
	public Employee getEmployeeDetails(Long id) {

		Session session = null;
		Employee employee = null;

		try {
			session = sessionFactory.getCurrentSession();
			employee = session.get(Employee.class, id);
		} catch (HibernateException e) {
			logger.error(e.getMessage());
		} catch (Exception e) {
			logger.error("Error " + e.getMessage());
		}
		return employee;
	}

}
