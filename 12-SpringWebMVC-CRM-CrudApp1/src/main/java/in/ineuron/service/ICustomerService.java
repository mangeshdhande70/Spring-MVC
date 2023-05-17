package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Customer;

public interface ICustomerService {
		
	public List<Customer> getAllCustomer();
	
	public Customer saveCustomer(Customer customer);
	
	public void deleteCustomer(Integer id);
	
	public Customer getCustomer(Integer id);
	
	public Customer updateCustomerDetails(Customer customer);

}
