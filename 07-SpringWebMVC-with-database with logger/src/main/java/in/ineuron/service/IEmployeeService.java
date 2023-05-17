package in.ineuron.service;

import in.ineuron.dto.EmployeeDto;

public interface IEmployeeService {
	
	public Long saveEmployee(EmployeeDto employeeDto);
	public EmployeeDto getEmployeeDetails(Long id);
}
