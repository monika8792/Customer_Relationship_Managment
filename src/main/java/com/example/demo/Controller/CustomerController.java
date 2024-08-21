package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService serv;
	@PostMapping("/save")
	 public ResponseEntity<Customer> createCustomer(@RequestBody Customer customerDto){
		
		 Customer cust= serv.createCustomer(customerDto);
		  return new ResponseEntity<>(cust,HttpStatus.CREATED);
		  
		  
	 }
	@GetMapping("/{id}")
	 public ResponseEntity<Customer> getById(@PathVariable Integer id){
		 Customer dto=serv.getById(id);
		  return new ResponseEntity<>(dto,HttpStatus.OK);
		 
	 }
	@GetMapping("/all")
	 public ResponseEntity<List<Customer>> getByall(){
		 List<Customer> dto=serv.getAllCustomers();
		  return new ResponseEntity<>(dto,HttpStatus.OK);
		 
	 }
	
	
	@GetMapping("/byname/{firstName}")
	 public  ResponseEntity<List<Customer>> getName(@PathVariable String firstName){
		 List<Customer> customer=  serv.getFirstName(firstName);
		  return new ResponseEntity<>(customer,HttpStatus.OK);
	 }
	
	@GetMapping("/bylastname/{lastname}")
	 public  ResponseEntity<List<Customer>> getlastName(@PathVariable String lastname){
		 List<Customer> customer=  serv.findlastname(lastname);
		  return new ResponseEntity<>(customer,HttpStatus.OK);
	 }
	
	
	@GetMapping("/byemail/{email}")
	 public  ResponseEntity<Customer> getCustomeremail(@PathVariable String email){
		Customer customer=  serv.getCustomerbyemail(email);
		  return new ResponseEntity<>(customer,HttpStatus.OK);
	 }
	@GetMapping("/bynumber/{number}")
	 public  ResponseEntity<List<Customer>> getByNumber(String number){
		 List<Customer> cust=serv.findbynumber(number);
		 return new ResponseEntity<>(cust,HttpStatus.OK); 
	 }
	
	@GetMapping("/byage/{age}")
	 public  ResponseEntity<List<Customer>> getByNumber(@PathVariable Integer age){
		 List<Customer> cust=serv.findByage(age);
		 return new ResponseEntity<>(cust,HttpStatus.OK); 
	 }
	
	@GetMapping("/byLessThan/{age}")
	 public  ResponseEntity<List<Customer>> getByageLessThan(@PathVariable Integer age){
		 List<Customer> cust=serv.getagelessthan(age);
		 return new ResponseEntity<>(cust,HttpStatus.OK); 
	 }
	
	@GetMapping("/byGreaterThan/{age}")
	 public  ResponseEntity<List<Customer>> getByagrGreaterThan(@PathVariable Integer age){
		 List<Customer> cust=serv.getGreaterThan(age);
		 return new ResponseEntity<>(cust,HttpStatus.OK); 
	 }
	 

}
