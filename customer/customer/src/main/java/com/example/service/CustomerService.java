package com.example.service;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.example.model.Customer;

public interface CustomerService {

	public Customer addCustomer(Customer c);
	public List<Customer> getAllCustomers();
	public Customer  updateCustomer(Customer c);
}
