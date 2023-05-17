package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ineuron.dto.EmployeeDto;
import in.ineuron.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeService iEmployeeService;
	
	@GetMapping("/")
	public String registerPage() {
		
		return "index";
	}
	
	
	@PostMapping(value = "/register")
	public String register(EmployeeDto employeeDto , Model model) {
		Long id = iEmployeeService.saveEmployee(employeeDto);
		model.addAttribute("id", id);
		return "registered";
	}
	
	
	@GetMapping(value = "/get/{id}")
	public String getEmployeeDetails(@PathVariable("id") Long id,Model model) {
		
	  EmployeeDto employeeDto = iEmployeeService.getEmployeeDetails(id);
	  
	  System.out.println(employeeDto);
	 
	  model.addAttribute("employee", employeeDto);
 	  
	  return "data";
		
	}
	
}
	

