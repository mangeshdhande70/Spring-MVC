package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ICustomerDao;
import in.ineuron.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao repo;

	@Override
	public List<Customer> getAllCustomer() {		
		return (List<Customer>) repo.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {		
		return repo.save(customer);
	}

	@Override
	public void deleteCustomer(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Customer getCustomer(Integer id) {
		
		Optional<Customer> optional = repo.findById(id);
		
		return optional.get();
	}

	@Override
	public Customer updateCustomerDetails(Customer customer) {
		
		return repo.save(customer);
	}
	
	
	

}
