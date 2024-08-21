package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;
@Service
public class CustometServiceImpl  implements CustomerService{
  
	@Autowired
	private CustomerRepository repository;
	@Override
	public Customer createCustomer(Customer customer) {
		   return repository.save(customer);
		 
	}

	@Override
	public Customer getById(Integer id) {
		 Optional<Customer>  op=repository.findById(id);
		  Customer cus=op.get();
		return cus;
	}

	@Override
	public List<Customer> getAllCustomers() {
	 List<Customer> allcustomer=	repository.findAll();
		return allcustomer;
	}

	@Override
	public List<Customer> getFirstName(String firstName) {
		 List<Customer> cus=repository.findByFirstName(firstName);
		return cus;
		
	}

	@Override
	public List<Customer> findlastname(String name) {
		 List<Customer> cus=repository.findByLastName(name);
		return cus;
	}

	@Override
	public List<Customer> findbynumber(String number) {
		 List<Customer>  cc=repository.findByMobileNumber(number);
		return cc;
	}

	@Override
	public List<Customer> findByage(int age) {
		 List<Customer> cust=repository.findByAge(age);
		return cust;
	}

	@Override
	public List<Customer> getagelessthan(int age) {
		 List<Customer> cust=repository.findByAgeLessThan(age);
		return cust;
	}

	@Override
	public List<Customer> getGreaterThan(int age) {
		 List<Customer> cust=repository.findByAgeGreaterThan(age);
		return cust;
	}

//	@Override
//	public String updateFistName(int id, Customer customer) {
//		 boolean existCustomer= repository.existsById(id);
//		 existCustomer.setFirstName(customer.getFirstName());
//		return null;
//	}

	@Override
	public Customer getCustomerbyemail(String email) {
		 Optional<Customer> cc=repository.findFirstbyEmail(email);
		 Customer cust= cc.get();
		return cust;
	}

	@Override
	public String updateFistName(int id, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	



	

//	@Override
//	public List<Customer> getCustomerbyemail(String email) {
//		 List<Customer> cust=repository.findbyEmail(email);
//		return cust;
//	}

}
