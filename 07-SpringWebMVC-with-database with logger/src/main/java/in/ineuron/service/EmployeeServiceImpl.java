package in.ineuron.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IEmployeeDao;
import in.ineuron.dto.EmployeeDto;
import in.ineuron.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao iEmployeeDao;

	@Override
	public Long saveEmployee(EmployeeDto employeeDto) {

		Employee employee = new Employee();

		BeanUtils.copyProperties(employeeDto, employee);

		return iEmployeeDao.saveEmployeeDetails(employee);
	}

	@Override
	public EmployeeDto getEmployeeDetails(Long id) {

		EmployeeDto employeeDto = new EmployeeDto();
		Employee employee = iEmployeeDao.getEmployeeDetails(id);
		BeanUtils.copyProperties(employee, employeeDto);

		return employeeDto;
	}

}
