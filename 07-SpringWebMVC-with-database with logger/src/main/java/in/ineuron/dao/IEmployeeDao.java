package in.ineuron.dao;

import in.ineuron.model.Employee;

public interface IEmployeeDao {
	
	public Long saveEmployeeDetails(Employee employee);
	
	public Employee getEmployeeDetails(Long id);

}
