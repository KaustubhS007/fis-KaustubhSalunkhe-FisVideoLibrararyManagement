package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired 
	private CustomerService cust;
	@GetMapping("/getAll")

	public List<Customer> getAllDetails()
	{
		return this.cust.getAllCustomers();
	}
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer c)
	{
		return this.cust.addCustomer(c);
		
	}
	@PutMapping("/update")
	public Customer updatingMovie(@RequestBody Customer c)

	{
		return this.cust.updateCustomer(c);
		
	}
}
