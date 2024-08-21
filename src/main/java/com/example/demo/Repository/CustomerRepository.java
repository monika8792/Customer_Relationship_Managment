package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;
@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer>{
    
	public List<Customer>  findByFirstName(String name);
	public List<Customer> findByLastName(String name);
	public Optional<Customer> findFirstbyEmail(String email);
	public List<Customer> findByMobileNumber(String number);
	 public List<Customer> findByAgeLessThan(int age);
	 public List<Customer> findByAge(int age);
	 public List<Customer> findByAgeGreaterThan(int age);
	// public List<Customer> findByAgeBetween(int age);
}
