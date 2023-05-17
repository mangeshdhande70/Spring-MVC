package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ineuron.model.Customer;
import in.ineuron.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService service;

	@GetMapping(value = "/list")
	public String getAllCustomer(Model model) {
		
		List<Customer> customer = service.getAllCustomer();
		model.addAttribute("cust" , customer);
		
//		customer.forEach(System.out::println);
		
		return "customer/list-customer";
		
	}
	
	
	@GetMapping(value = "/showForm")
	public String customerRegistartionForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer/customer-form";
	}
	
	
	@PostMapping(value = "/saveCustomer")
	public String saveCustomer(@ModelAttribute Customer customer) {
		service.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@PostMapping(value = "/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") Integer customerId) {
		service.deleteCustomer(customerId);
		return "redirect:/customer/list";
		
	}
	
	@PostMapping(value = "/showFormForUpdate")
	public String updateCusyomerDetails(@RequestParam Integer customerId ,Model model) {
		
		Customer customer = service.getCustomer(customerId);
		model.addAttribute("customer" , customer);
		
		return "/customer/customer-form";
	}
	
}
