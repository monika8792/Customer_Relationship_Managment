package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	   Customer getById(Integer id);
	   public List<Customer> getAllCustomers();
	   public List<Customer>  getFirstName(String firstName);
	   public List<Customer>  findlastname(String name);
	   
Customer getCustomerbyemail(String email);
	List<Customer> findbynumber(String number);
	public List<Customer> findByage(int age);
	
	public List<Customer> getagelessthan(int age);
	public List<Customer> getGreaterThan(int age); 
	public String updateFistName ( int id, Customer customer);
}
	